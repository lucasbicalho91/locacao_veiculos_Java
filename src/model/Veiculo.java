/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Lucas
 */

public abstract class Veiculo implements VeiculoI {
    private Estado estado;
    private Marca marca;
    private Categoria categoria;
    private Locacao locacao;
    private String placa;
    private int ano;
    private double valorDeCompra;
    private int idadeVeiculoEmAnos;

    public Veiculo(Estado estado, Marca marca, Categoria categoria, Locacao locacao, String placa, int ano, double valorDeCompra, int idadeVeiculoEmAnos) {
        this.estado = estado;
        this.marca = marca;
        this.categoria = categoria;
        this.locacao = locacao;
        this.placa = placa;
        this.ano = ano;
        this.valorDeCompra = valorDeCompra;
        this.idadeVeiculoEmAnos = idadeVeiculoEmAnos;
    }

    @Override
    public void locar(int dias, Calendar data, Cliente cliente) {
        estado = Estado.LOCADO;
        locacao = new Locacao();
        //locacao.setDiasLocacao(dias);
        //locacao.setDataLocacao(data);
        //locacao.setCliente(cliente);
        double valorDiaria = getValorDiariaLocacao();
        double valorLocacao = dias * valorDiaria;
        //locacao.setValorLocacao(valorLocacao);
    }

    @Override
    public void vender() {
        estado = Estado.VENDIDO;
    }

    @Override
    public void devolver() {
        estado = Estado.DISPONIVEL;
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
        double valorParaVenda = valorDeCompra - idadeVeiculoEmAnos * 0.15 * valorDeCompra;
        if (valorParaVenda < 0 || valorParaVenda < 0.1 * valorDeCompra) {
            valorParaVenda = valorDeCompra * 0.1;
        }
        return valorParaVenda;
    }

    @Override
    public double getValorDiariaLocacao() {
        // Implementação do cálculo do valor da diária de locação
        return 100.0; // Exemplo: valor fixo para a diária de locação
    }
}

