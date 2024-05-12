/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import enums.Categoria;
import enums.Estado;
import enums.Marca;
import enums.ModeloAutomovel;

/**
 *
 * @author Lucas
 */
public class Automovel extends Veiculo {
    private final ModeloAutomovel modelo;

    public Automovel(Marca marca, Categoria categoria, Locacao locacao, String placa, int ano,
                     double valorDeCompra, ModeloAutomovel modelo, Estado estado) {
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
            case Popular -> 100.00;
            case Intermediario -> 300.00;
            case Luxo -> 450.00;
            default -> 0.00;
        }; // Valor padrão se categoria não estiver definida corretamente
    }
}
