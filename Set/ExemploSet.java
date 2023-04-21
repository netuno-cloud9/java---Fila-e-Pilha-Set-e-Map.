/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Faça um programa que leia uma frase e informe o número de palavras não
repetidas da frase
*/
public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Digite uma frase");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String [] fraseQuebrada = frase.split(" ");
        Set<String> palavras = new HashSet<>();
        for (int i = 0; i < fraseQuebrada.length; i++) {
            boolean sim = palavras.add(fraseQuebrada[i]);
            if(sim){
                fraseQuebrada[i] = null;
            }
        }
        int palavrasSet = palavras.size();
        for (int i = 0; i < fraseQuebrada.length; i++) {
            if(palavras.contains(fraseQuebrada[i])){
                palavras.remove(fraseQuebrada[i]);
            }
            
        }
        
        System.out.println(palavras.size());
        
    }
}
