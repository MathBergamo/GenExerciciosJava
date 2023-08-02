package LacosRepeticao.Lista01;

import java.util.Scanner;

/*
Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela
quantos números são pares e quantos número são ímpares.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laços Condicionais
- Laço de Repetição FOR

 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0, impares = 0, num;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num = scanner.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.printf("\nTotal de números pares: %d", pares);
        System.out.printf("\nTotal de números impares: %d", impares);
    }
}
