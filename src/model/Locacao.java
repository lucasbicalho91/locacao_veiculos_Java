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

public class Locacao {
    private int diasLocacao;
    private Calendar dataLocacao;
    private Cliente cliente;
    private double valorLocacao;

    public int getDiasLocacao() {
        return diasLocacao;
    }

    public void setDiasLocacao(int diasLocacao) {
        this.diasLocacao = diasLocacao;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
}

