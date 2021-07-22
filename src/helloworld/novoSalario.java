/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;

/**
 *
 * @author jairb
 */
public class novoSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        double salario, salarioNovo;
        String cat;
        
        System.out.print("Informe salário: ");
        salario = leia.nextDouble();
        System.out.print("Informe  categoria (A/B): ");
        cat = leia.next();
        cat = cat.toLowerCase();//passa o valor da var para minuscula | toUpperCase para maiuscula     
        //limpar o console
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17); // Holds CTRL key.
            pressbot.keyPress(76); // Holds L key.
            pressbot.keyRelease(17); // Releases CTRL key.
            pressbot.keyRelease(76); // Releases L key.
          } catch (AWTException ex) {
            System.out.println("erro: " + ex);
          }
        
        switch (cat){//no visualG é o Escolha
            case "a":
                salarioNovo = salario * 1.5;
                break;
            case "b":
                salarioNovo = salario * 1.3;
                break;
            default://no visualG é o OutroCaso
                salarioNovo = salario * 1.1;
                break;
        }
        System.out.println("Salário reajustado: " +
                salarioNovo);
    }
    
}
