/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Faça um programa que leia uma frase e informe o número de ocorrencias
de cada palavra da frase
 */
public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Digite uma frase");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String [] fraseQuebrada = frase.split(" ");
        Map<String, Integer> palavras = new HashMap<>();
        for (int i = 0; i < fraseQuebrada.length; i++) {
            if(palavras.containsKey(fraseQuebrada[i])){
                palavras.put(fraseQuebrada[i], 
                        palavras.get(fraseQuebrada[i])+1);
            } else {
                palavras.put(fraseQuebrada[i], 1);
            }
        }
        Set<String> keys = palavras.keySet();
        System.out.println("Palavras contidas na frase: \nPalavras"
                + "\tOcorrencias");
        for(String key: keys){
            System.out.println(key + "\t\t\t"+ palavras.get(key));
        }
        
        System.out.printf("\nQuantidade de palavras: %d\nFrase esta "
                + "vazio: %b\n", palavras.size(), palavras.isEmpty());
        
    }
}
