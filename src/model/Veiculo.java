/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import interfaces.VeiculoI;
import enums.Categoria;
import enums.Marca;
import enums.Estado;
import java.util.Calendar;

/**
 *
 * @author Lucas
 */

public abstract class Veiculo implements VeiculoI {

    private final Marca marca;
    protected final Categoria categoria;
    private Locacao locacao;
    private final String placa;
    private final int ano;
    private final double valorCompra;
    private Estado estado;

    public Veiculo(Marca marca, Categoria categoria, Locacao locacao, 
                    String placa, int ano, double valorCompra, Estado estado) {
        this.marca = marca;
        this.categoria = categoria;
        this.locacao = locacao;
        this.placa = placa;
        this.ano = ano;
        this.valorCompra = valorCompra;
        this.estado = estado;
    }

    @Override
    public void locar(int dias, Calendar data, Cliente cliente) {
        locacao = new Locacao();
        locacao.setDiasLocacao(dias);
        locacao.setDataLocacao(data);
        locacao.setCliente(cliente);
        double valorDiaria = getValorDiariaLocacao();
        double valorLocacao = dias * valorDiaria;
        locacao.setValorLocacao(valorLocacao);
        estado = Estado.Locado;
    }

    @Override
    public void vender() {
        estado = Estado.Vendido;
    }

    @Override
    public void devolver() {
        estado = Estado.Disponivel;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public Marca getMarca() {
        return marca;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public Locacao getLocacao() {
        return locacao;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public double getValorParaVenda() {
        return valorCompra * 0.1;
    }

    @Override
    public double getValorDiariaLocacao() {
        // Implementação do cálculo do valor da diária de locação
        return 100.0; // Exemplo: valor fixo para a diária de locação
    }
      
    public double getValorCompra() {
        return valorCompra;
    }
      
    public abstract String getModelo();
    
}

