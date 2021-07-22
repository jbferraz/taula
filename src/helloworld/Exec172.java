/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jairb
 */
public class Exec172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ler alunos, 4 notas, realizar a média e atualizar 
        //a situação final do aluno considerando média 7 das escola
        Scanner ler = new Scanner(System.in);
        int lin, col;
        Random notaAletoria = new Random();//fazer import

        System.out.println(".: Informar dimensões da matriz :.");
        System.out.print("# de Alunos: ");//linhas
        lin = ler.nextInt();
        System.out.print("# de notas: ");//colunas
        col = ler.nextInt();

        //verificação
        if (lin <= 0) {
            lin = 1;
        }
        if (col <= 3) {
            col = 4;//no minimo 4 notas
        }

        String nomeSit[][] = new String[lin][2];///col 1 nome aluno, col 2 situação
        double notas[][] = new double[lin][(col + 1)];//guardar as notas + um col da média final

        System.out.println("Informe Alunos e Notas");
        for (int i = 0; i < lin; i++) {//percorrer linhas
            System.out.println("Informe aluno # " + (i + 1));
            nomeSit[i][0] = ler.next(); //ler nome do aluno
            nomeSit[i][0] = nomeSit[i][0].toUpperCase();
            for (int j = 0; j < col; j++) {//percorrer colunas das notas
                System.out.println("Informe a nota " + (j + 1) + ": ");
                notas[i][j] = notaAletoria.nextInt(10);//limita a até nota peso 10
                notas[i][col] = notas[i][col] + notas[i][j];//calcula média
            }//fimpara
            notas[i][col] = notas[i][col] / col;
            if (notas[i][col] >= 7) {
                nomeSit[i][1] = "Aprovado";
            } else {
                nomeSit[i][1] = "Reprovado";
            }
        }//fimpara
        System.out.println(".: Resultado :.");
        for (int i = 0; i < lin; i++) {
            System.out.println(nomeSit[i][0] + " - " + nomeSit[i][1]
                    + " - Média final: " + notas[i][col]);
        }
    }
}