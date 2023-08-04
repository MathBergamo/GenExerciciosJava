package VetoresEMatrizes.Lista02;

import java.util.Scanner;

/*
Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano.
As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais,
logo cada linha da matriz serão as notas de um participante.
Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Laços Condicionais
- Laços de Repetição
- Matrizes

 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[][] notas = new float[10][4];
        float[] medias = new float[10];
        float soma = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Aluno [%d] Nota [%d]: ", i, j);
                notas[i][j] = scanner.nextFloat();
                soma += notas[i][j];
            }
            medias[i] = soma/ 4;
            soma = 0;
            System.out.println();
        }

        System.out.println("Médias:");
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("[%.1f] ",medias[i]);
        }
    }
}
