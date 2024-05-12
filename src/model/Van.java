/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import enums.Categoria;
import enums.Estado;
import enums.Marca;
import enums.ModeloVan;

/**
 *
 * @author Lucas
 */
public class Van extends Veiculo {
    
    private final ModeloVan modelo;

    public Van(Estado estado, Marca marca, Categoria categoria, Locacao locacao, String placa, int ano,
               double valorDeCompra, ModeloVan modelo) {
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
            case Popular -> 200.00;
            case Intermediario -> 400.00;
            case Luxo -> 600.00;
            default -> 0.00;
        }; // Valor padrão se categoria não estiver definida corretamente
    }
}

