/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

/*
Escreva um programa que simule a distribuição de senhas de atendimento
a um grupo de pessoas. Cada pessoa pode receber uma senha prioritária
ou uma senha normal. Existe apenas 1 atendente, 1 pessoa com senha 
normal deve ser atendida a cada 3 pessoas com senha prioritária.
*/
public class Senha {
    private int numero;
    private String tipo;

    public Senha(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Senha{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
        
}
