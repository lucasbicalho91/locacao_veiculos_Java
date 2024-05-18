/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import enums.Estado;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Veiculo;
import utilities.VeiculoFactory;

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
      Veiculo veiculo = buscarVeiculoPorCodigo(id);
        
        if (veiculo != null) {
            veiculo.vender();
      
      String sql = "update tb_veiculos set estado = ? where id = ?";

      try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, veiculo.getEstado().getDescricao());
        stmt.setInt(2, id);

        stmt.execute();
        stmt.close();
      }

      JOptionPane.showMessageDialog(null, "Veículo vendido com sucesso");
        }
    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
    }
  }

    public List<Veiculo> listarVeiculos() {
        List<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM tb_veiculos";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            while (rs.next()) {
                Veiculo veiculo = VeiculoFactory.criarVeiculo(rs);
                if (veiculo != null) {
                    VeiculoFactory.popularVeiculo(rs, veiculo);
                    veiculos.add(veiculo);
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
        return veiculos;
    }

  public List<Veiculo> filtrarVeiculos(String campo, String valor) {
      List<Veiculo> veiculos = new ArrayList<>();
      String sql = "SELECT * FROM tb_veiculos WHERE " + campo + " = ? AND estado <> ?";
      try (PreparedStatement stmt = conn.prepareStatement(sql)) {
          stmt.setString(1, valor);
          stmt.setString(2, Estado.VENDIDO.getDescricao());
          ResultSet rs = stmt.executeQuery();
          while (rs.next()) {
              Veiculo veiculo = VeiculoFactory.criarVeiculo(rs);
              if (veiculo != null) {
                  VeiculoFactory.popularVeiculo(rs, veiculo);
                  veiculos.add(veiculo);
              }
          }
          if (veiculos.isEmpty()) {
              JOptionPane.showMessageDialog(null, 
                      "Nenhum veículo de " + campo + " " + valor + " disponível para venda.");
          }
      } catch (SQLException erro) {
          JOptionPane.showMessageDialog(null, "Erro: " + erro);
      }
      return veiculos;
  }
  
  public Veiculo buscarVeiculoPorCodigo(int id) {
      String sql = "SELECT * FROM tb_veiculos WHERE id = ?";
      try (PreparedStatement stmt = conn.prepareStatement(sql)) {
          stmt.setInt(1, id);
          ResultSet rs = stmt.executeQuery();
          if (rs.next()) {
              String estado = rs.getString("estado");
              if (estado.equals(Estado.DISPONIVEL.getDescricao())) {
                  Veiculo veiculo = VeiculoFactory.criarVeiculo(rs);
                  if (veiculo != null) {
                      VeiculoFactory.popularVeiculo(rs, veiculo);
                      return veiculo;
                  }
              } else {
                  JOptionPane.showMessageDialog(null, "Esse veículo não está disponível para venda.");
              }
          } else {
              JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
          }
      } catch (SQLException erro) {
          JOptionPane.showMessageDialog(null, "Erro: " + erro);
      }
      return null;
  }
  
}
