/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Lucas
 */
public enum Categoria {
    
    POPULAR("Popular"),
    INTERMEDIARIO("Intermediário"),
    LUXO("Luxo");

    private final String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static Categoria fromDescricao(String descricao) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.descricao.equals(descricao)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Categoria inválida: " + descricao);
    }
    
}
