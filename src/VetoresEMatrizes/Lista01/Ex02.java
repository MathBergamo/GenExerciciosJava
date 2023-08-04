package VetoresEMatrizes.Lista01;

import java.util.Scanner;

/*
Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
Todos os elementos dos índices ímpares do vetor
Todos os elementos do vetor que são números pares
A Soma de todos os elementos do vetor
A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Laços Condicionais
- Laços de Repetição
- Vetores

 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        float soma = 0, media;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o [%d]º valor para armazenar no vetor: ", i+1);
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nElementos nos índices ímpares");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nElementos pares");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.printf("\nSoma: %.0f\nMédia: %.2f", soma, media);
    }
}
