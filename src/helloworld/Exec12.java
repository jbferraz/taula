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
public class Exec12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String op;
        double num, total;
        total = 0;
        System.out.println(".: Exec12 :.");
        op = "s";
        while ("s".equals(op)) {    //inicio do enquanto        
            System.out.print("Informe um num.: ");
            num = ler.nextDouble();
            total = total + num;
            System.out.print("Deseja continnuar? S/N: ");
            op = ler.next();
            op = op.toLowerCase();
        }//fim do enquanto
        System.out.print("O somatório é: " + total);
    }
}
