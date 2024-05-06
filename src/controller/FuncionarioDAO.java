/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Funcionario;
import view.FrmMenu;

/**
 *
 * @author Lucas
 */
public class FuncionarioDAO {
    
    private final Connection conn;
    
    public FuncionarioDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    //Incluir
    public void cadastrarFuncionario(Funcionario funcionario) {
        
        try {
            String sql = "insert into tb_funcionarios "
                    + "(nome, sobrenome, email, senha, cargo, acesso, celular) "
                    + "values (?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, funcionario.getNome());
                stmt.setString(2, funcionario.getSobrenome());
                stmt.setString(3, funcionario.getEmail());
                stmt.setString(4, funcionario.getSenha());
                stmt.setString(5, funcionario.getCargo());
                stmt.setString(6, funcionario.getAcesso());
                stmt.setString(7, funcionario.getCelular());

                stmt.execute();
                stmt.close();
            }
            
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
    }
    
    //Atualizar
    public void alterarFuncionario(Funcionario funcionario) {
        
        try {
            String sql = "update tb_funcionarios set nome = ?, sobrenome = ?, "
                    + "email = ?, senha = ?, cargo = ?, acesso = ?, celular = ? where id = ?";
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, funcionario.getNome());
                stmt.setString(2, funcionario.getSobrenome());
                stmt.setString(3, funcionario.getEmail());
                stmt.setString(4, funcionario.getSenha());
                stmt.setString(5, funcionario.getCargo());
                stmt.setString(6, funcionario.getAcesso());
                stmt.setString(7, funcionario.getCelular());
                stmt.setInt(8, funcionario.getId());
                
                stmt.execute();
            }
            
            JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
    }    
    
    
    //Excluir
    public void excluirFuncionario(Funcionario funcionario) {
        
        try {String sql = "delete from tb_funcionarios where id = ?";
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, funcionario.getId());
                
                stmt.execute();
                stmt.close();
            }
            
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
    }    
    
    //Listar
    public List<Funcionario> listarFuncionarios() {
        
        try {
            List<Funcionario> funcionarios = new ArrayList<>();

            String sql = "select * from tb_funcionarios";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSobrenome(rs.getString("sobrenome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setAcesso(rs.getString("acesso"));
                funcionario.setCelular(rs.getString("celular"));

                funcionarios.add(funcionario);
            }

            return funcionarios;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
        
    }
    
    //buscar cliente por nome
    public List<Funcionario> listarFuncionarioPorNome(String nome) {

        try {
            List<Funcionario> funcionarios = new ArrayList<>();

            String sql = "select * from tb_funcionarios where nome like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSobrenome(rs.getString("sobrenome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setCelular(rs.getString("celular"));

                funcionarios.add(funcionario);
            }

            return funcionarios;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }
 
    //buscar cliente por nome
    public Funcionario buscarFuncionarioPorCodigo(int id) {

        try {

            String sql = "select * from tb_funcionarios where id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            Funcionario funcionario = new Funcionario();

            if (rs.next()) {       

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSobrenome(rs.getString("sobrenome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setCelular(rs.getString("celular"));
            }
            
            return funcionario;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
            return null;
        }

    }
    
    //Logar
    public void logar(String email, String senha) {
        
        try {
            String sql = "select * from tb_funcionarios where email = ? and senha = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Seja Bem-Vindo(a) ao Sistema");
                FrmMenu tela = new FrmMenu();
                tela.usuarioLogado = rs.getString("nome") + " " + rs.getString("sobrenome");
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Dados incorretos!");
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
    }
    
}
