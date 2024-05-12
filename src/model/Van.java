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

    public Van(int id, Marca marca, ModeloVan modelo, Categoria categoria, Locacao locacao, 
            String placa, int ano, double valorCompra, String tipo, Estado estado) {
        super(id, marca, categoria, locacao, placa, ano, valorCompra, tipo, estado);
        this.modelo = modelo;
    }
    
    public Van() {
        
    }

    @Override
    public String getModelo() {
        return modelo.toString();
    }
    
    public void setModelo(ModeloVan modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        return switch (categoria) {
            case POPULAR -> 200.00;
            case INTERMEDIARIO -> 400.00;
            case LUXO -> 600.00;
            default -> 0.00;
        }; // Valor padrão se categoria não estiver definida corretamente
    }
}

