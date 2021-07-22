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
public class Exec14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String op, opR;//caractere no visualG
        double num, numR, total = 0, totalR = 0;//real no visualG

        System.out.println(".: Exec14 :.");
        op = "s";
        System.out.println(".: Enquanto :.");
        // '||' pipe é a mesma coisa que 'ou' '&&' é o mesmo 'e'           
        while ("s".equals(op) || "S".equals(op)) {
            System.out.print("Informe um núm.: ");
            num = ler.nextDouble();
            total = total + num;
            System.out.print("Deseja continuar? S/N: ");
            op = ler.next();
        }//fimenquanto no visualG
        System.out.println("O somatório é: " + total);
        System.out.println(".: Rapita :.");
        do {//Repita no visualG            
            System.out.print("Informe um núm. para cálculo: ");
            numR = ler.nextDouble();
            totalR = totalR + numR;
            System.out.print("Deseja continuar? S/N: ");
            opR = ler.next();
            opR = opR.toLowerCase();//converte em cx baixa
        } while ("s".equals(opR));//ate do repita no visualG
        System.out.println("O somatório 2 é: " + totalR);
    }//fim main
}///fim exec14
