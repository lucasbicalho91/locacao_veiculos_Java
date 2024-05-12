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

    public Motocicleta(Marca marca, ModeloMotocicleta modelo, Categoria categoria, Locacao locacao, String placa, 
            int ano, double valorCompra, String tipo, Estado estado) {
        super(marca, categoria, locacao, placa, ano, valorCompra, tipo, estado);
        this.modelo = modelo;
    }
    
    public Motocicleta() {
        
    }

    @Override
    public String getModelo() {
        return modelo.toString();
    }

    public void setModelo(ModeloMotocicleta modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        return switch (categoria) {
            case POPULAR -> 70.00;
            case INTERMEDIARIO -> 200.00;
            case LUXO -> 350.00;
            default -> 0.00;
        }; // Valor padrão se categoria não estiver definida corretamente
    }
}

