/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import enums.Categoria;
import enums.Estado;
import enums.Marca;
import enums.ModeloAutomovel;
import enums.ModeloMotocicleta;
import enums.ModeloVan;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Automovel;
import model.Motocicleta;
import model.Van;
import model.Veiculo;

/**
 *
 * @author Lucas
 */
public class VeiculoFactory {

    public static Veiculo criarVeiculo(ResultSet rs) throws SQLException {
        String tipo = rs.getString("tipo_veiculo");
        switch (tipo) {
            case "Automóvel" -> {
                Automovel automovel = new Automovel();
                automovel.setModelo(ModeloAutomovel.valueOf(rs.getString("modelo")));
                return automovel;
            }
            case "Motocicleta" -> {
                Motocicleta motocicleta = new Motocicleta();
                motocicleta.setModelo(ModeloMotocicleta.valueOf(rs.getString("modelo")));
                return motocicleta;
            }
            case "Van" -> {
                Van van = new Van();
                van.setModelo(ModeloVan.valueOf(rs.getString("modelo")));
                return van;
            }
            default -> {
                throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
            }
        }
    }

    public static void popularVeiculo(ResultSet rs, Veiculo veiculo) throws SQLException {
        veiculo.setId(rs.getInt("id"));
        veiculo.setMarca(Marca.valueOf(rs.getString("marca")));
        veiculo.setCategoria(Categoria.fromDescricao(rs.getString("categoria")));
        veiculo.setPlaca(rs.getString("placa"));
        veiculo.setAno(rs.getInt("ano"));
        veiculo.setValorCompra(rs.getDouble("valor_compra"));
        veiculo.setTipo(rs.getString("tipo_veiculo"));
        veiculo.setEstado(Estado.fromDescricao(rs.getString("estado")));
    }
}
