/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;

import model.Cliente;
import utilities.WebServiceCep;

/**
 *
 * @author Lucas
 */
public class ClienteDAO {
    
    private final Connection conn;
    
    public ClienteDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    //Incluir
    public void cadastrarCliente(Cliente cliente) {

        try {
            String sql = "insert into tb_clientes (nome, sobrenome, rg, cpf, email, celular, cep, endereco,"
                            + "numero, complemento, bairro, cidade, uf, veiculo_locado) "
                            + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getSobrenome());
                stmt.setString(3, cliente.getRg());
                stmt.setString(4, cliente.getCpf());
                stmt.setString(5, cliente.getEmail());
                stmt.setString(6, cliente.getCelular());
                stmt.setString(7, cliente.getCep());
                stmt.setString(8, cliente.getEndereco());
                stmt.setInt(9, cliente.getNumero());
                stmt.setString(10, cliente.getComplemento());
                stmt.setString(11, cliente.getBairro());
                stmt.setString(12, cliente.getCidade());
                stmt.setString(13, cliente.getUf());
                stmt.setBoolean(14, false);
                
                stmt.execute();
                stmt.close();
            }
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
    }
    
    //Atualizar
    public void alterarCliente(Cliente cliente) {
        
        try {
            String sql = "update tb_clientes set nome = ?, sobrenome = ?, rg = ?, cpf = ?, "
                    + "email = ?, celular = ?, cep = ?, endereco = ?, numero = ?, complemento = ?, "
                    + "bairro = ?, cidade = ?, uf = ? where id = ?";
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getSobrenome());
                stmt.setString(3, cliente.getRg());
                stmt.setString(4, cliente.getCpf());
                stmt.setString(5, cliente.getEmail());
                stmt.setString(6, cliente.getCelular());
                stmt.setString(7, cliente.getCep());
                stmt.setString(8, cliente.getEndereco());
                stmt.setInt(9, cliente.getNumero());
                stmt.setString(10, cliente.getComplemento());
                stmt.setString(11, cliente.getBairro());
                stmt.setString(12, cliente.getCidade());
                stmt.setString(13, cliente.getUf());
                stmt.setInt(14, cliente.getId());
                
                stmt.execute();
            }
            
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
    }
    
    //Excluir
    public void excluirCliente(Cliente cliente) {
        
        if (cliente.getLocado() == 0) {
          try {String sql = "delete from tb_clientes where id = ?";
          
          try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cliente.getId());
            
            stmt.execute();
            stmt.close();
          }
          
          JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso");
          
          } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
          }
        }
        else {
          JOptionPane.showMessageDialog(null,
                  "Não é possível excluir cliente que possui veículo locado");
        }
          
    }
    
    //Listar
    public List<Cliente> listarClientes() {

        try {
            List<Cliente> clientes = new ArrayList<>();

            String sql = "select * from tb_clientes";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("uf"));
                cliente.setLocado(rs.getInt("veiculo_locado"));

                clientes.add(cliente);
            }

            return clientes;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }

    //buscar cliente por nome ou sobrenome
    public List<Cliente> listarClientePorNome(String nome, String sobrenome) {

    try {
      List<Cliente> clientes = new ArrayList<>();

      String sql = "select * from tb_clientes where nome like ? and sobrenome like ?";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, nome);
      stmt.setString(2, sobrenome);
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        Cliente cliente = new Cliente();

        cliente.setId(rs.getInt("id"));
        cliente.setNome(rs.getString("nome"));
        cliente.setSobrenome(rs.getString("sobrenome"));
        cliente.setRg(rs.getString("rg"));
        cliente.setCpf(rs.getString("cpf"));
        cliente.setEmail(rs.getString("email"));
        cliente.setCelular(rs.getString("celular"));
        cliente.setCep(rs.getString("cep"));
        cliente.setEndereco(rs.getString("endereco"));
        cliente.setNumero(rs.getInt("numero"));
        cliente.setComplemento(rs.getString("complemento"));
        cliente.setBairro(rs.getString("bairro"));
        cliente.setCidade(rs.getString("cidade"));
        cliente.setUf(rs.getString("uf"));
        cliente.setLocado(rs.getInt("veiculo_locado"));

        clientes.add(cliente);
      }

      return clientes;

    } catch (SQLException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro);
      return null;
    }

  }
 
    //buscar cliente por id
    public Cliente buscarClientePorCodigo(int id) {

        try {

            String sql = "select * from tb_clientes where id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            Cliente cliente = new Cliente();

            if (rs.next()) {       

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("uf"));
                cliente.setLocado(rs.getInt("veiculo_locado"));
            }
            
            return cliente;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            return null;
        }
    }
    
    public Cliente buscarClientePorCpf(String cpf) {

        try {

            String sql = "select * from tb_clientes where cpf = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            
            Cliente cliente = new Cliente();

            if (rs.next()) {       

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("uf"));
                cliente.setLocado(rs.getInt("veiculo_locado"));
            }
            
            return cliente;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            return null;
        }

    }
    
    public Cliente buscaCep(String cep) {

        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);

        Cliente cliente = new Cliente();

        if (webServiceCep.wasSuccessful()) {
            cliente.setEndereco(webServiceCep.getLogradouroFull());
            cliente.setCidade(webServiceCep.getCidade());
            cliente.setBairro(webServiceCep.getBairro());
            cliente.setUf(webServiceCep.getUf());
            return cliente;
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descri��o do erro: " + webServiceCep.getResultText());
            return null;
        }

    }
 
}
