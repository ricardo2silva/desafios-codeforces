package com.desafios.codeforces.logicaprogramacao.desafios;

import java.util.Locale;
import java.util.Scanner;

public class Team {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de exercicios : ");
        int qtdExercicio = sc.nextInt();

        int qtdAluno = 3;

        int count = 0;

        int[][] exercicios = new int[qtdExercicio][qtdAluno];

        for(int i = 0; i < qtdExercicio; i++) {

            int sabeResolverQuestao = 0;

            for(int j = 0; j < qtdAluno; j ++){
                System.out.println("Digite 1 se voce sabe resolver ou 0 que nao sabe resolver.");
                System.out.println(String.format("Exercicio %d Aluno %d :", i + 1 , j + 1));
                exercicios[i][j] = sc.nextInt();
                if(exercicios[i][j] == 1) {
                    sabeResolverQuestao++;
                }

            }
            if(sabeResolverQuestao >= 2) {
                count ++;
            }
        }
        System.out.println(count);
    }

}
