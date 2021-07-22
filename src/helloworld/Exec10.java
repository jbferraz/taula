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
public class Exec10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String aluno;
        double n1, n2, n3, media;
        int nQuant;
        
        System.out.println(".: Exec10 :.");
        System.out.print("Informe o nome do Aluno: ");
        aluno = ler.next();
        aluno = aluno.toUpperCase();
        System.out.print("Informe quantas notas serão inseridas: ");
        nQuant = ler.nextInt();
        System.out.print("Informe a nota 1: ");
        n1 = ler.nextDouble();
        System.out.print("Informe a nota 2: ");
        n2 = ler.nextDouble();
        System.out.print("Informe a nota 3: ");
        n3 = ler.nextDouble();
        media = (n1 + n2 + n3)/3;
        n2 = 0;
        for (int i = 1; i <= nQuant; i++) {
            System.out.print("Informe a nota " + i + ": ");
            n1 = ler.nextDouble();
            n2 = n2 + n1;
        }
        System.out.println(".: Resultado :.");
        System.out.println("O(a) aluno(a) " + aluno +
                " teve a média final de: " + media);
        System.out.println("---");
        System.out.println("O(a) aluno(a) " + aluno +
                " teve a média final de: " + (n2/nQuant));
    }
}
