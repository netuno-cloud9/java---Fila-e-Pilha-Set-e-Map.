/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Controller;

import Lista.Model.GerenciadorDeProdutos;
import Lista.Model.Produto;
import java.io.IOException;

/**
 *
 * @author instrutor
 */
public class Controller {

    private GerenciadorDeProdutos g;

    public Controller() {
        g = new GerenciadorDeProdutos();
    }

    public boolean addProduto(String desc, String marca, Double preco) throws IOException {
        if (!desc.isEmpty() && !marca.isEmpty() && preco != 0) {
            Produto p = new Produto(desc, marca, preco);
            g.addProduto(p);
            return true;
        } else {
            return false;
        }
    }

    public Produto consultaProduto(String desc, String marca) {
        if (!desc.isEmpty() && !marca.isEmpty()) {
            return g.consultaProduto(desc, marca);
        } else {
            return null;
        }
    }

    public boolean removeProduto(String desc, String marca) {
        if (!desc.isEmpty() && !marca.isEmpty()) {
            return g.removeProduto(desc, marca);
        } else {
            return false;
        }
    }

    public boolean atualizaProduto(String desc, String marca,
            String nDesc, String nMarca, Double nPreco) {
        if (!desc.isEmpty() && !marca.isEmpty()) {
            if (!nDesc.isEmpty() && !nMarca.isEmpty() && nPreco != 0) {
                return g.atualizaProduto(desc, marca, nDesc, nMarca, nPreco);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
