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
public class Exec162 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = ler.nextInt();
        String nome[] = new String[tamanho];//declaração de vetor
        
        System.out.println(".: Exec16 :.");
        System.out.println("Ler nomes");
        for (int i = 0; i < tamanho; i++) {//para no visualG
            System.out.println("Informe o nome # " +
                    (i+1) + ": ");
            nome[i] = ler.next();
            nome[i] = nome[i].toUpperCase();
        }//fimpara no visualG
        System.out.println("Lista de nomes do vetor");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("O " + (i+1) +"º nome foi " +
                    nome[i]);
        }
        System.out.println("Lista do vetor invertida");
        for (int i = (tamanho-1); i >= 0; i--) {
            System.out.println("O " + (i+1) +"º nome foi " +
                    nome[i]);
        }
    }
    
}
