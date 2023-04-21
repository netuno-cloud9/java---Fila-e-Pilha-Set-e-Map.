/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.View;

import Lista.Controller.Controller;
import Lista.Model.Produto;
import java.util.Scanner;

/**
 *
 * @author instrutor
 */
public class Interface {
    public static void main(String[] args) {
        Controller c = new Controller();
        boolean continuar = true;
        System.out.println("Bem Vindo!");
        Scanner scan = new Scanner(System.in);
        while(continuar){
            System.out.println("\nEscolha qual operação deseja realizar:\n"
                    + "1 - Adicionar um produto\n"
                    + "2 - Consultar um produto\n"
                    + "3 - Remover um produto\n"
                    + "4 - Atualizar um produto\n"
                    + "5 - Sair");
            int escolha = Integer.parseInt(scan.nextLine());
            switch(escolha){
                case 1:
                    System.out.println("Digite a descricao, marca e preco");
                    String desc = scan.nextLine();
                    String marca = scan.nextLine();
                    double preco = Double.parseDouble(scan.nextLine());
                    if(c.addProduto(desc, marca, preco)){
                        System.out.println("Produto adicionado com sucesso");
                    } else {
                        System.out.println("Existem campos não preenchidos");
                    }
                    break;
                case 2:
                    System.out.println("Digite a descricao e marca");
                    String desc2 = scan.nextLine();
                    String marca2 = scan.nextLine();
                    Produto p = c.consultaProduto(desc2, marca2);
                    if(p == null){
                        System.out.println("Produto não encontrado");
                    } else {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Digite a descricao e marca");
                    String desc3 = scan.nextLine();
                    String marca3 = scan.nextLine();
                    if(c.removeProduto(desc3, marca3)){
                        System.out.println("Produto removido!");
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Digite a descricao e marca");
                    String desc4 = scan.nextLine();
                    String marca4 = scan.nextLine();
                    String nDesc;
                    String nMarca;
                    Double nPreco;
                    System.out.println("Deseja editar a descricao (Y/N)");
                    String e = scan.nextLine().toUpperCase();
                    if(e.equals("Y")){
                        System.out.println("Digite a nova descricao do produto");
                        nDesc = scan.nextLine();
                    } else {
                        nDesc = desc4;
                    }
                    System.out.println("Deseja editar a marca (Y/N)");
                    String e2 = scan.nextLine().toUpperCase();
                    if(e2.equals("Y")){
                        System.out.println("Digite a nova marca do produto");
                        nMarca = scan.nextLine();
                    } else {
                        nMarca = marca4;
                    }
                    System.out.println("Deseja editar o preco (Y/N)");
                    String e3 = scan.nextLine().toUpperCase();
                    if(e3.equals("Y")){
                        System.out.println("Digite a novo preco do produto");
                        nPreco = Double.parseDouble(scan.nextLine());
                    } else {
                        nPreco = c.consultaProduto(desc4, marca4).getPreco();
                    }
                    c.atualizaProduto(desc4, marca4, nDesc, nMarca, nPreco);
                    System.out.println(c.consultaProduto(nDesc, nMarca));
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
