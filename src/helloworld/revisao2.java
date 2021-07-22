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
public class revisao2 {
    
    public static void menu(){//procedimento
        System.out.println("-- Menu --");
        System.out.println("1 - Multiplicação");
        System.out.println("2 - Imprimir");
        System.out.println("3 - Sair");
        System.out.println("Escolha uma opção: ");
    }
    
    public static double mult(double num1, double num2){//função
        return num1 * num2;
    }
    
    public static String texto(){//função sem parametro
        return "Teste de Função com String";
    }
    
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        double n1, n2, result;
        int opM;
        String sistema = "s";
        
        while ("s".equals(sistema)) {            
            menu();
            opM = ler.nextInt();
            switch (opM){//escolha ()
                case 1:
                    System.out.println("Multiplicação");
                    System.out.println("Digite num1 ");
                    n1 = ler.nextDouble();
                    System.out.println("Digite num2");
                    n2 = ler.nextDouble();
                    result = mult(n1, n2);
                    System.out.println("Resultado: " + result);
                    break;
                case 2:
                    System.out.println("opção 2");
                    System.out.println(texto());
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Tente novamente!");
                    menu();
                    break;
            }//fimescolha
            System.out.println("Deseja continuar? s/n");
            sistema = ler.next();
            sistema = sistema.toLowerCase();
        }//fimenquanto
        System.out.println("Aplicação encerrada pelo usuário");
    }
    
}
