/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import enums.Estado;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Locacao;
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
      Veiculo veiculo = buscarVeiculoDisponivelPorCodigo(id);
        
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

    public List<Veiculo> filtrarVeiculos(Object marca, Object categoria, Object tipo) {
        List<Veiculo> veiculos = new ArrayList<>();
        StringBuilder sqlBuilder = new StringBuilder("SELECT * FROM tb_veiculos WHERE 1=1");

        if (marca != null) {
            sqlBuilder.append(" AND marca = ?");
        }
        if (categoria != null) {
            sqlBuilder.append(" AND categoria = ?");
        }
        if (tipo != null) {
            sqlBuilder.append(" AND tipo_veiculo = ?");
        }
        sqlBuilder.append(" AND estado = ?");

        try (PreparedStatement stmt = conn.prepareStatement(sqlBuilder.toString())) {
            int index = 1;

            if (marca != null) {
                stmt.setObject(index++, marca);
            }
            if (categoria != null) {
                stmt.setObject(index++, categoria);
            }
            if (tipo != null) {
                stmt.setObject(index++, tipo);
            }
            stmt.setString(index, Estado.DISPONIVEL.getDescricao());

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
                        "Nenhum veículo disponível para venda ou locação no filtro selecionado.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        return veiculos;
    }
  
  public Veiculo buscarVeiculoDisponivelPorCodigo(int id) {
      String sql = "SELECT * FROM tb_veiculos WHERE id = ?";
      try (PreparedStatement stmt = conn.prepareStatement(sql)) {
          stmt.setInt(1, id);
          ResultSet rs = stmt.executeQuery();
          if (rs.next()) {
              
              
                  Veiculo veiculo = VeiculoFactory.criarVeiculo(rs);
                  if (veiculo != null) {
                      VeiculoFactory.popularVeiculo(rs, veiculo);
                      return veiculo;
                  }
          } 
      } catch (SQLException erro) {
          JOptionPane.showMessageDialog(null, "Erro: " + erro);
      }
      return null;
  }
  
    public List<Veiculo> listarVeiculosLocados() {
        List<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT v.*, l.id AS id_locacao, l.id_cliente, l.dias, l.valor, l.data_locacao, c.nome " + 
                     "AS nome_cliente FROM tb_veiculos v " +
                     "INNER JOIN tb_locacao l ON v.id = l.id_veiculo " +
                     "INNER JOIN tb_clientes c ON l.id_cliente = c.id where estado = 'Locado'";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Veiculo veiculo = VeiculoFactory.criarVeiculo(rs);
                    if (veiculo != null) {
                        VeiculoFactory.popularVeiculo(rs, veiculo);
                        Locacao locacao = VeiculoFactory.popularLocacao(rs);
                        veiculo.setLocacao(locacao);
                        veiculos.add(veiculo);
                    }
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

        return veiculos;
    }

  
}
