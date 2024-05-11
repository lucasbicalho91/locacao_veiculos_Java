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
    private ModeloVan modelo;

    public Van(Estado estado, Marca marca, Categoria categoria, Locacao locacao, String placa, int ano,
               double valorDeCompra, ModeloVan modelo) {
        super(estado, marca, categoria, locacao, placa, ano, valorDeCompra);
        this.modelo = modelo;
    }

    public ModeloVan getModelo() {
        return modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        switch (categoria) {
            case Popular:
                return 200.00;
            case Intermediario:
                return 400.00;
            case Luxo:
                return 600.00;
            default:
                return 0.00; // Valor padrão se categoria não estiver definida corretamente
        }
    }
}

