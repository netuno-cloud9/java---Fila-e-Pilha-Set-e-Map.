/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
Escreva um programa que simule a distribuição de senhas de atendimento
a um grupo de pessoas. Cada pessoa pode receber uma senha prioritária
ou uma senha normal. Existe apenas 1 atendente, 1 pessoa com senha 
normal deve ser atendida a cada 3 pessoas com senha prioritária.
*/
public class Atendente {
    public static void main(String[] args) throws InterruptedException {
        Queue<Senha> senhas = new ConcurrentLinkedQueue<>();
        Scanner scan = new Scanner(System.in);
        int numero = 1;
        int contador = 0;
        while(true){
            System.out.println("Deseja distribuir uma senha? (Y/N)");
            String resposta = scan.nextLine().toUpperCase();
            if(resposta.equals("Y")){
                System.out.println("Qual o tipo de senha?");
                String tipo = scan.nextLine().toUpperCase();
                Senha novo = new Senha(numero, tipo);
                numero++;
                senhas.add(novo);
            } else {
                if(senhas.isEmpty()){
                    System.out.println("Não existem senhas a serem chamadas");
                    System.out.println("Deseja encerrar o expediente (Y/N)");
                    resposta = scan.nextLine().toUpperCase();
                    if(resposta.equals("Y")){
                        break;
                    } else{
                        continue;
                    }
                } else {
                    for(Senha atual: senhas){
                        if(atual.getTipo().equals("PRIORITARIA")){
                            if(contador < 3){
                                senhas.remove(atual);
                                System.out.println("Chamando "+ atual);
                                contador++;
                                new Thread().sleep(5000);
                            } else {
                                break;
                            }
                        }
                    }
                    
                    System.out.println("Chamando "+ senhas.poll());
                    contador=0;
                }
            }
        }
    }
}
