package VetoresEMatrizes.Lista02;

import java.util.Scanner;

/*
Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
Todos os elementos da Diagonal Principal
Todos os elementos da Diagonal Secundária
A Soma de todos os elementos da Diagonal Principal
A Soma de todos os elementos da Diagonal Secundária

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Laços Condicionais
- Laços de Repetição
- Matrizes


 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Digite o valor [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.print("\nElementos na diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[" + matriz[i][i]+ "] ");
            somaDiagonalPrincipal += matriz[i][i];
        }

        System.out.print("\nElementos na diagonal secundária:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[" + matriz[i][2 - i]+ "] ");
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        System.out.printf("\nSoma diagonal principal: %d", somaDiagonalPrincipal);
        System.out.printf("\nSoma diagonal secundária: %d", somaDiagonalSecundaria);
    }
}

