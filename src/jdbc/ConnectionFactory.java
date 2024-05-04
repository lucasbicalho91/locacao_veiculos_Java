/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class ConnectionFactory {
    
    public Connection getConnection() {
        
        try {
            
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/locadora_veiculos", "usuariolocadora", "1234");
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
}
