/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
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
    
    public void cadastrarAutomovel(Veiculo veiculo, String tipoVeiculo) {
        
        try {
            String sql = "insert into tb_veiculos (marca, modelo, categoria, placa, ano, "
                    + "valor_compra, tipo_veiculo, estado) values (?, ?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, veiculo.getMarca().toString());
                stmt.setString(2, veiculo.getModelo());
                stmt.setString(3, veiculo.getCategoria().toString());
                stmt.setString(4, veiculo.getPlaca());
                stmt.setInt(5, veiculo.getAno());
                stmt.setDouble(6, veiculo.getValorCompra());
                stmt.setString(7, tipoVeiculo);
                stmt.setString(8, "Disponivel");
                
                stmt.execute();
            }
            
            JOptionPane.showMessageDialog(null, "Automóvel cadastrado com sucesso");
           
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        
    }
    
    
}
