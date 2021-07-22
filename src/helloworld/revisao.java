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
public class revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criar calculadora
        Scanner ler = new Scanner(System.in);
        String opM, sistema = "s";
        double num1, num2, resultado = 0;

        //sistema == "s"
        while ("s".equals(sistema)) {//enquanto () faca            
            System.out.println("-- Calculadora --");
            System.out.println("Valor 1");
            num1 = ler.nextDouble();
            System.out.println("Valor 2");
            num2 = ler.nextDouble();
            System.out.println("+ Soma");
            System.out.println("- Subtração");
            System.out.println("* Multiplicação");
            System.out.println("/ Divisão");
            System.out.println("Escolha um opção: ");
            opM = ler.next();

            switch (opM) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Tente novamente!");
                    break;
            }
            System.out.println("O resultado da " + opM
                    + " é: " + resultado);
            System.out.println("---");
            System.out.println("Deseja continuar? s/n: ");
            sistema = ler.next();//ler valor pelo console
            sistema = sistema.toLowerCase();//passa para minuscula
        }//fimenquanto
        System.out.println("---");
        System.out.println("Sistema encerrado pelo usuário!");
        System.out.println("---");
    }

}
