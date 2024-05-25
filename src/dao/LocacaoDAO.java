/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import enums.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Cliente;
import model.Locacao;
import model.Veiculo;
import utilities.VeiculoFactory;

/**
 *
 * @author Lucas
 */
public class LocacaoDAO {

  private final Connection conn;

  public LocacaoDAO() {
    this.conn = new ConnectionFactory().getConnection();
  }

  //Atualizar veículo locado
  public Veiculo atualizarVeiculoLocado(int id, int dias, Calendar data, Cliente cliente) {
    try {
      
      VeiculoDAO veiculoDAO = new VeiculoDAO();
      Veiculo veiculo = veiculoDAO.buscarVeiculoDisponivelPorCodigo(id);

      if (veiculo != null) {
        if (veiculo.getEstado() == Estado.DISPONIVEL) {
          veiculo.locar(dias, data, cliente);
        } else {
          JOptionPane.showMessageDialog(null,
                  "Veículo não disponível para locação");
          return null;
        }

        String sql = "update tb_veiculos set estado = ? where id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

          stmt.setString(1, veiculo.getEstado().getDescricao());
          stmt.setInt(2, id);
          stmt.execute();
        }
        sql = "update tb_clientes set veiculo_locado = ? where id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
          stmt.setInt(1, veiculo.getLocacao().getCliente().getLocado());
          stmt.setInt(2, veiculo.getLocacao().getCliente().getId());
          stmt.execute();
          stmt.close();
        }
        return veiculo;
      } else {
        JOptionPane.showMessageDialog(null, "Veículo não encontrado");
      }
    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
    }
    return null;
  }
  //Atualizar veículo devolvido

  public Veiculo atualizarVeiculoDevolvido(Veiculo veiculo, Cliente cliente) {
    try {
      if (veiculo != null) {
        if (veiculo.getEstado() == Estado.LOCADO) {
          veiculo.devolver();
        } else {
          JOptionPane.showMessageDialog(null,
                  "Veículo não disponível para devolução");
          return null;
        }
        String sql = "update tb_veiculos set estado = ? where id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
          stmt.setString(1, veiculo.getEstado().getDescricao());
          stmt.setInt(2, veiculo.getId());
          stmt.execute();
        }

        sql = "update tb_clientes set veiculo_locado = ? where id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
          stmt.setInt(1, cliente.getLocado());
          stmt.setInt(2, cliente.getId());
          stmt.execute();
        }
        return veiculo;
      } else {
        JOptionPane.showMessageDialog(null, "Veículo não disponível para locação ou devolução");
      }
    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
    }

    return null;
  }

  //Cadastrar locação
  public void cadastrarLocacao(Locacao locacao, int idVeiculo) {

    Object dataLocacao = new java.sql.Date(locacao.getDataLocacao().getTimeInMillis());

    try {
      String sql = "insert into tb_locacao (id_cliente, id_veiculo, dias, valor, data_locacao) "
              + "values (?, ?, ?, ?, ?)";

      try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, locacao.getCliente().getId());
        stmt.setInt(2, idVeiculo);
        stmt.setInt(3, locacao.getDiasLocacao());
        stmt.setDouble(4, locacao.getValorLocacao());
        stmt.setObject(5, dataLocacao);

        stmt.execute();
      }
      JOptionPane.showMessageDialog(null, "Locação cadastrada com Sucesso!");

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
    }
  }
  //Excluir Locação
  public void excluirLocacao (int id) {
          try {String sql = "delete from tb_locacao where id = ?";
          try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
          }
          
          JOptionPane.showMessageDialog(null, "Veículo devolvido com sucesso");
          
          } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
          }   
  }

public Veiculo buscarVeiculoLocadoPorId(int id) {
    String sql = "SELECT v.*, l.id AS id_locacao, l.id_cliente, l.dias, l.valor, l.data_locacao, c.nome AS nome_cliente " +
                 "FROM tb_veiculos v " +
                 "LEFT JOIN tb_locacao l ON v.id = l.id_veiculo " +
                 "LEFT JOIN tb_clientes c ON l.id_cliente = c.id " +
                 "WHERE v.id = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            Veiculo veiculo = VeiculoFactory.criarVeiculo(rs);
            VeiculoFactory.popularVeiculo(rs, veiculo);
                Locacao locacao = VeiculoFactory.popularLocacao(rs);
                veiculo.setLocacao(locacao);

            return veiculo;
        } else {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
        }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro: " + erro);
    }
    return null;
}

}
