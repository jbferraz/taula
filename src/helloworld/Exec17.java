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
public class Exec17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int numeros[][] = new int[3][3];

        System.out.println(".: exec17 :.");
        System.out.println("Popule uma matriz de inteiros");
        for (int i = 0; i < 3; i++) {//para i de 1 ate 3 faca | percorre a linha da matriz
            for (int j = 0; j < 3; j++) {//para i de 1 ate 3 faca | percorre a coluna da matriz
                System.out.println("Informe o valor inteiro"
                        + " da posição: L" + (i + 1) + ":C" + (j + 1));
                numeros[i][j] = ler.nextInt();
            }//fimpara
        }//fimpara
        System.out.println("Impressão da Matriz de valores");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("O valor inserido na posição: L"
                        + (i + 1) + ":C" + (j + 1) + "-> " + numeros[i][j]);
            }//fimpara
        }//fimpara
        System.out.println("Impressão da Matriz de valores "
                + "na ordem inversa");
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.println("O valor inserido na posição: L"
                        + (i + 1) + ":C" + (j + 1) + "-> " + numeros[i][j]);
            }
        }
    }

}
