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
public class Exec13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        double base, altura, area;
        int qtd;
        
        System.out.println(".: Exec13 :.");
        qtd = 1;
        
        while (qtd<=5) {            
            System.out.print("Informe a base " + 
                    qtd + ": ");
            base = ler.nextDouble();
            System.out.print("Informe a altura " +
                    qtd + ": ");
            altura = ler.nextDouble();
            area = (base*altura)/2;
            System.out.println("Triângulo " + 
                    qtd + " tem a área de: " + area);
            qtd++; // soma mais 1 ou como qtd = qtd + 1
        }
    }
}
