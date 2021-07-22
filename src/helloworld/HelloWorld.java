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
public class HelloWorld {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        String aluno, situacao;
        double n1, n2, n3, media, freq;
                
        System.out.println(".: Exec4 - VisualG :."); //EscravaL no visualG
        System.out.print("Informe o nome do aluno: ");
        aluno = leia.next();
        System.out.print("Informe a nota 1: ");//Escrava no visualG
        n1 = leia.nextDouble();
        System.out.print("Informe a nota 2: ");
        n2 = leia.nextDouble();
        System.out.print("Informe a nota 3: ");
        n3 = leia.nextDouble();
        media = (n1 + n2 + n3)/3;
        System.out.print("Informe a frequência: ");
        freq = leia.nextDouble();
        if (media>=7 && freq>=75){ //estrutura SE no visualG && é and || é or
            situacao = "Aprovado";
        }else{ // senao no visualG
            situacao = "Reprovado";
        }
        System.out.println(".: Resultado :.");
        System.out.println("O Aluno(a) " + aluno + 
                " teve a média final de: " + media +
                " e foi " + situacao);
    }
}
