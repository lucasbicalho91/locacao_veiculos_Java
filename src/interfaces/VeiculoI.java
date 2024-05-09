/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import enums.Categoria;
import enums.Marca;
import enums.Estado;
import java.util.Calendar;
import model.Cliente;
import model.Locacao;

/**
 *
 * @author Lucas
 */
public interface VeiculoI {
    
    public void locar(int dias, Calendar data, Cliente cliente);

    public void vender();

    public void devolver();

    public Estado getEstado();
    public Marca getMarca();
    public Categoria getCategoria();
    public Locacao getLocacao();
    public String getPlaca();
    public int getAno();

    public double getValorParaVenda();

    public double getValorDiariaLocacao();

    
}
