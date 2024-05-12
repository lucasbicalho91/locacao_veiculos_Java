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

    public Automovel(Marca marca, ModeloAutomovel modelo, Categoria categoria, Locacao locacao, String placa, 
            int ano, double valorCompra, String tipo, Estado estado) {
        super(marca, categoria, locacao, placa, ano, valorCompra, tipo, estado);
        this.modelo = modelo;
    }
    
    public Automovel() {
        
    }

    @Override
    public String getModelo() {
        return modelo.toString();
    }
    
    public void setModelo(ModeloAutomovel modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        return switch (categoria) {
            case POPULAR -> 100.00;
            case INTERMEDIARIO -> 300.00;
            case LUXO -> 450.00;
            default -> 0.00;
        }; // Valor padrão se categoria não estiver definida corretamente
    }

    
}
