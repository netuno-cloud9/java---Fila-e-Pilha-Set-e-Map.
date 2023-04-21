/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Model;

/**
 *
 * @author instrutor
 */
public class Produto {
    private String descricao, marca;
    private Double preco;

    public Produto(String descricao, String marca, Double preco) {
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", marca=" + marca + ", preco=" + preco + '}';
    }
    
}
