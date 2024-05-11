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
    private ModeloAutomovel modelo;

    public Automovel(Estado estado, Marca marca, Categoria categoria, Locacao locacao, String placa, int ano,
                     double valorDeCompra, int idadeVeiculoEmAnos, ModeloAutomovel modelo) {
        super(estado, marca, categoria, locacao, placa, ano, valorDeCompra);
        this.modelo = modelo;
    }

    public ModeloAutomovel getModelo() {
        return modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        switch (categoria) {
            case Popular:
                return 100.00;
            case Intermediario:
                return 300.00;
            case Luxo:
                return 450.00;
            default:
                return 0.00; // Valor padrão se categoria não estiver definida corretamente
        }
    }
}
