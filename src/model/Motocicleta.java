/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import enums.Categoria;
import enums.Estado;
import enums.Marca;
import enums.ModeloMotocicleta;

/**
 *
 * @author Lucas
 */
public class Motocicleta extends Veiculo {
    private final ModeloMotocicleta modelo;

    public Motocicleta(Estado estado, Marca marca, Categoria categoria, Locacao locacao, String placa, int ano,
                       double valorDeCompra, int idadeVeiculoEmAnos, ModeloMotocicleta modelo) {
        super(marca, categoria, locacao, placa, ano, valorDeCompra, estado);
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return modelo.toString();
    }

    @Override
    public double getValorDiariaLocacao() {
        return switch (categoria) {
            case Popular -> 70.00;
            case Intermediario -> 200.00;
            case Luxo -> 350.00;
            default -> 0.00;
        }; // Valor padrão se categoria não estiver definida corretamente
    }
}

