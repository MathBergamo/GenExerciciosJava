package LacosRepeticao.Lista03;

import java.util.Scanner;

/*
Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado.
Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laços Condicionais
- Laço de Repetição DO...WHILE

 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0, soma = 0;

        do {
            System.out.print("Digite um valor a ser somado:");
            num = scanner.nextInt();

            if (num > 0) {
                soma += num;
            }
        } while (num != 0);

        System.out.printf("\nO valor total da soma foi: %d", soma);
    }
}
