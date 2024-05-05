/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Funcionario;

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
            String sql = "insert into tb_clientes (nome, sobrenome, email, senha, cargo, nivel_acesso, celular) "
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
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
    }
    
}
