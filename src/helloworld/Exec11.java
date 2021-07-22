/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author jairb
 */
public class Exec11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String nome, nomeVelho;
        int idade, idadeVelho;
        idadeVelho = 0;
        nomeVelho = "";
        System.out.println(".: Exec11 :.");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o " + i + 
                    "º nome: ");
            nome = ler.next();
            nome = nome.toUpperCase();
            System.out.print("Informe a idade: ");
            idade = ler.nextInt();
            if (idade>idadeVelho) {// inicio do se
                nomeVelho = nome;
                idadeVelho = idade;
            }//fim se
        }//fimpara
        System.out.println(".: Resultado :.");
        System.out.println("A pessoa mais velha é o(a) " +
                nomeVelho + " e sua idade: " + idadeVelho);
    }
}
