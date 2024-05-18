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

    private int id;
    private Marca marca;
    protected Categoria categoria;
    private Locacao locacao;
    private String placa;
    private int ano;
    private double valorCompra;
    private String tipo;
    private Estado estado;
    
    public Veiculo() {
        
    }

    public Veiculo(int id, Marca marca, Categoria categoria, Locacao locacao, String placa, 
                    int ano, double valorCompra, String tipo, Estado estado) {
        this.id = id;
        this.marca = marca;
        this.categoria = categoria;
        this.locacao = locacao;
        this.placa = placa;
        this.ano = ano;
        this.valorCompra = valorCompra;
        this.tipo = tipo;
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
        estado = Estado.LOCADO;
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
        return valorCompra - (valorCompra * 0.1);
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

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

