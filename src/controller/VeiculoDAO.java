/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import enums.Categoria;
import enums.Estado;
import enums.Marca;
import enums.ModeloAutomovel;
import enums.ModeloMotocicleta;
import enums.ModeloVan;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Automovel;
import model.Motocicleta;
import model.Van;
import model.Veiculo;

/**
 *
 * @author Lucas
 */
public class VeiculoDAO {

  private final Connection conn;

  public VeiculoDAO() {
    this.conn = new ConnectionFactory().getConnection();
  }

  public void cadastrarVeiculo(Veiculo veiculo, String tipoVeiculo) {

    try {
      String sql = "insert into tb_veiculos (marca, modelo, categoria, placa, ano, "
              + "valor_compra, tipo_veiculo, estado) values (?, ?, ?, ?, ?, ?, ?, ?)";

      try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, veiculo.getMarca().toString());
        stmt.setString(2, veiculo.getModelo());
        stmt.setString(3, veiculo.getCategoria().getDescricao());
        stmt.setString(4, veiculo.getPlaca());
        stmt.setInt(5, veiculo.getAno());
        stmt.setDouble(6, veiculo.getValorCompra());
        stmt.setString(7, tipoVeiculo);
        stmt.setString(8, Estado.DISPONIVEL.getDescricao());

        stmt.execute();
        stmt.close();
      }

      JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso");

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
    }

  }
  
  public void venderVeiculo(int id) {
    
    try {
      String sql = "update tb_veiculos set estado = ? where id = ?";

      try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, Estado.VENDIDO.getDescricao());
        stmt.setInt(2, id);

        stmt.execute();
        stmt.close();
      }

      JOptionPane.showMessageDialog(null, "Veículo vendido com sucesso");

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
    }
  }

  public List<Veiculo> listarVeiculos() {

    try {
      List<Veiculo> veiculos = new ArrayList<>();

      String sql = "select * from tb_veiculos";
      PreparedStatement stmt = conn.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        Veiculo veiculo;
        String tipo = rs.getString("tipo_veiculo");

        switch (tipo) {
          case "Automóvel" -> {
            veiculo = new Automovel();
            ((Automovel) veiculo).setModelo(ModeloAutomovel.valueOf(rs.getString("modelo")));
          }
          case "Motocicleta" -> {
            veiculo = new Motocicleta();
            ((Motocicleta) veiculo).setModelo(ModeloMotocicleta.valueOf(rs.getString("modelo")));
          }
          case "Van" -> {
            veiculo = new Van();
            ((Van) veiculo).setModelo(ModeloVan.valueOf(rs.getString("modelo")));
          }
          default -> throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }

        veiculo.setId(rs.getInt("id"));
        veiculo.setMarca(Marca.valueOf(rs.getString("marca")));
        veiculo.setCategoria(Categoria.fromDescricao(rs.getString("categoria")));
        veiculo.setPlaca(rs.getString("placa"));
        veiculo.setAno(rs.getInt("ano"));
        veiculo.setValorCompra(rs.getDouble("valor_compra"));
        veiculo.setTipo(tipo);
        veiculo.setEstado(Estado.fromDescricao(rs.getString("estado")));

        veiculos.add(veiculo);
      }

      return veiculos;

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
      return null;
    }

  }
  
  public List<Veiculo> listarVeiculosPorMarca(String marca) {

    try {
      List<Veiculo> veiculos = new ArrayList<>();

      String sql = "select * from tb_veiculos where marca = ? AND estado <> ?";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, marca);
      stmt.setString(2, Estado.VENDIDO.getDescricao());
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        Veiculo veiculo;
        String tipo = rs.getString("tipo_veiculo");

        switch (tipo) {
          case "Automóvel" -> {
            veiculo = new Automovel();
            ((Automovel) veiculo).setModelo(ModeloAutomovel.valueOf(rs.getString("modelo")));
          }
          case "Motocicleta" -> {
            veiculo = new Motocicleta();
            ((Motocicleta) veiculo).setModelo(ModeloMotocicleta.valueOf(rs.getString("modelo")));
          }
          case "Van" -> {
            veiculo = new Van();
            ((Van) veiculo).setModelo(ModeloVan.valueOf(rs.getString("modelo")));
          }
          default ->
            throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }

        veiculo.setId(rs.getInt("id"));
        veiculo.setMarca(Marca.valueOf(rs.getString("marca")));
        veiculo.setCategoria(Categoria.fromDescricao(rs.getString("categoria")));
        veiculo.setPlaca(rs.getString("placa"));
        veiculo.setAno(rs.getInt("ano"));
        veiculo.setValorCompra(rs.getDouble("valor_compra"));
        veiculo.setTipo(tipo);
        veiculo.setEstado(Estado.fromDescricao(rs.getString("estado")));

        veiculos.add(veiculo);
      }
   
      int quantidade = veiculos.size();
      
      if (quantidade <= 0) {
        JOptionPane.showMessageDialog(null, 
                "Nenhum veículo da marca " + marca + " disponível para venda");
      }

      return veiculos;

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
      return null;
    }
  }  
  
  public List<Veiculo> listarVeiculosPorCategoria(String categoria) {

    try {
      List<Veiculo> veiculos = new ArrayList<>();

      String sql = "select * from tb_veiculos where categoria = ? AND estado <> ?";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, categoria);
      stmt.setString(2, Estado.VENDIDO.getDescricao());
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        Veiculo veiculo;
        String tipo = rs.getString("tipo_veiculo");

        switch (tipo) {
          case "Automóvel" -> {
            veiculo = new Automovel();
            ((Automovel) veiculo).setModelo(ModeloAutomovel.valueOf(rs.getString("modelo")));
          }
          case "Motocicleta" -> {
            veiculo = new Motocicleta();
            ((Motocicleta) veiculo).setModelo(ModeloMotocicleta.valueOf(rs.getString("modelo")));
          }
          case "Van" -> {
            veiculo = new Van();
            ((Van) veiculo).setModelo(ModeloVan.valueOf(rs.getString("modelo")));
          }
          default ->
            throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }

        veiculo.setId(rs.getInt("id"));
        veiculo.setMarca(Marca.valueOf(rs.getString("marca")));
        veiculo.setCategoria(Categoria.fromDescricao(rs.getString("categoria")));
        veiculo.setPlaca(rs.getString("placa"));
        veiculo.setAno(rs.getInt("ano"));
        veiculo.setValorCompra(rs.getDouble("valor_compra"));
        veiculo.setTipo(tipo);
        veiculo.setEstado(Estado.fromDescricao(rs.getString("estado")));

        veiculos.add(veiculo);
      }
      
       int quantidade = veiculos.size();
      
      if (quantidade <= 0) {
        JOptionPane.showMessageDialog(null, 
                "Nenhum veículo de categoria " + categoria + " disponível para venda");
      }

      return veiculos;

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
      return null;
    }
  }  
  public List<Veiculo> listarVeiculosPorTipo(String tipo) {

    try {
      List<Veiculo> veiculos = new ArrayList<>();

      String sql = "select * from tb_veiculos where tipo_veiculo = ? AND estado <> ?";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, tipo);
      stmt.setString(2, Estado.VENDIDO.getDescricao());
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        Veiculo veiculo;

        switch (tipo) {
          case "Automóvel" -> {
            veiculo = new Automovel();
            ((Automovel) veiculo).setModelo(ModeloAutomovel.valueOf(rs.getString("modelo")));
          }
          case "Motocicleta" -> {
            veiculo = new Motocicleta();
            ((Motocicleta) veiculo).setModelo(ModeloMotocicleta.valueOf(rs.getString("modelo")));
          }
          case "Van" -> {
            veiculo = new Van();
            ((Van) veiculo).setModelo(ModeloVan.valueOf(rs.getString("modelo")));
          }
          default ->
            throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }

        veiculo.setId(rs.getInt("id"));
        veiculo.setMarca(Marca.valueOf(rs.getString("marca")));
        veiculo.setCategoria(Categoria.fromDescricao(rs.getString("categoria")));
        veiculo.setPlaca(rs.getString("placa"));
        veiculo.setAno(rs.getInt("ano"));
        veiculo.setValorCompra(rs.getDouble("valor_compra"));
        veiculo.setTipo(tipo);
        veiculo.setEstado(Estado.fromDescricao(rs.getString("estado")));

        veiculos.add(veiculo);
      }
      
      int quantidade = veiculos.size();
      
      if (quantidade <= 0) {
        JOptionPane.showMessageDialog(null, "Nenhum " + tipo + " disponível para venda");
      }

      return veiculos;
     

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
      return null;
    }
    
  }  
  
  public Veiculo buscarVeiculoPorCodigo(int id) {

    try {

      String sql = "select * from tb_veiculos where id = ?";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setInt(1, id);
      ResultSet rs = stmt.executeQuery();

        Veiculo veiculo = null;
        
        if (rs.next()) { 
        String tipo = rs.getString("tipo_veiculo");
        String estado = rs.getString("estado");
        
          if (estado.equals(Estado.DISPONIVEL.getDescricao())) {
            switch (tipo) {
            case "Automóvel" -> {
              veiculo = new Automovel();
              ((Automovel) veiculo).setModelo(ModeloAutomovel.valueOf(rs.getString("modelo")));
            }
            case "Motocicleta" -> {
              veiculo = new Motocicleta();
              ((Motocicleta) veiculo).setModelo(ModeloMotocicleta.valueOf(rs.getString("modelo")));
            }
            case "Van" -> {
              veiculo = new Van();
              ((Van) veiculo).setModelo(ModeloVan.valueOf(rs.getString("modelo")));
            }
            default ->
              throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
          }

        veiculo.setId(rs.getInt("id"));
        veiculo.setMarca(Marca.valueOf(rs.getString("marca")));
        veiculo.setCategoria(Categoria.fromDescricao(rs.getString("categoria")));
        veiculo.setPlaca(rs.getString("placa"));
        veiculo.setAno(rs.getInt("ano"));
        veiculo.setValorCompra(rs.getDouble("valor_compra"));
        veiculo.setTipo(rs.getString("tipo_veiculo"));
        veiculo.setEstado(Estado.fromDescricao(rs.getString("estado")));
        
        } else {
            JOptionPane.showMessageDialog(null, "Esse veículo não está disponível para venda");
          }

        } else {
          JOptionPane.showMessageDialog(null, "Veículo não encontrado");
        }

      return veiculo;

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
      return null;
    }
  }  
  
}
