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
public class calculaINSS {//Exec7 do visualG

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        double salario, inss;
        String colaborador;
        
        System.out.print("Informe o nome do colaborador: ");
        colaborador = ler.next();
        colaborador = colaborador.toUpperCase();
        System.out.print("Informe salário para INSS: ");
        salario = ler.nextDouble();
        
        if (salario <= 1100){//no visualG é o Se
            inss = salario * 0.075;
        }else if (salario <= 2203.48){// no visualG é o senao com se
                inss = salario * 0.09;
            }else if (salario <= 3305.22){
                inss = salario * 0.12;
            }else{
                inss = salario * 0.14;
            }
        
        System.out.println("Colaborador: " + colaborador + 
                " com salário: " + salario +
                " e o INSS ficou em: " + inss);
    }
}
