/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import java.util.Scanner;
import java.util.Stack;

/*
AABCCBAA
ARARA
OVO
NATTAN
ABFFBB
*/
public class Exemplo1 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = scan.nextLine();
        char[] palavra2 = palavra.toCharArray();
        if(palavra2.length % 2 == 0){
            int meio = palavra2.length/2;
            for(int i = 0; i < meio; i++){
                pilha.push(palavra2[i]);
            }
            for (int i = meio; i < palavra2.length; i++) {
                if(pilha.peek().equals(palavra2[i])){
                    pilha.pop();
                }
            }
        } else {
            int meio = (Integer) palavra2.length/2;
            for(int i = 0; i < meio; i++){
                pilha.push(palavra2[i]);
            }
            for (int i = meio+1; i < palavra2.length; i++) {
                if(pilha.peek().equals(palavra2[i])){
                    pilha.pop();
                }
            }
        }
        if(pilha.empty()){
            System.out.println("A palavra é um palindromo");
        } else {
            System.out.println("Não é um palindromo");
        }
    }
}
