/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import java.util.Scanner;
import java.util.Stack;

/*
Escreva um programa para verificar se uma expressão 
matematica tem os parenteses agrupados de forma correta
((A+B) - Incorreta
A+B( - Incorreta
)A+B(-C - Incorreta
(A + B)) - (C+ D - Incorreta
((A+B)+D) - Correta
*/
public class Exemplo2 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma expressão matematica");
        String palavra = scan.nextLine();
        char[] palavra2 = palavra.toCharArray();
        for (int i = 0; i < palavra2.length; i++) {
            if(palavra2[i] == '('){
                pilha.push(palavra2[i]);
            } else if(palavra2[i] == ')'){
                if(pilha.empty()){
                    pilha.push(palavra2[i]);
                } else {
                    pilha.pop();
                }
            }
        }
        
        if(pilha.empty()){
            System.out.println("A expressão está correta");
        } else {
            System.out.println("A expressão está incorreta");
        }
    }
}
