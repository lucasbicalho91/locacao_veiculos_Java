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
    private ModeloMotocicleta modelo;

    public Motocicleta(Estado estado, Marca marca, Categoria categoria, Locacao locacao, String placa, int ano,
                       double valorDeCompra, int idadeVeiculoEmAnos, ModeloMotocicleta modelo) {
        super(estado, marca, categoria, locacao, placa, ano, valorDeCompra);
        this.modelo = modelo;
    }

    public ModeloMotocicleta getModelo() {
        return modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        switch (categoria) {
            case POPULAR:
                return 70.00;
            case INTERMEDIARIO:
                return 200.00;
            case LUXO:
                return 350.00;
            default:
                return 0.00; // Valor padrão se categoria não estiver definida corretamente
        }
    }
}

