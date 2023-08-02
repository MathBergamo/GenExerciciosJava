package LacosRepeticao.Lista03;

import java.util.Scanner;

/*
Escreva um algoritmo em Java, que leia números inteiros via teclado,
até que o número zero seja digitado. Ao final, mostre na tela a média de todos os números digitados,
que sejam múltiplos de 3.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laços Condicionais
- Laço de Repetição DO...WHILE

 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, media = 0, soma = 0;

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            if (num % 3 == 0) {
                soma += num;
                System.out.println(soma);
                media++;
                System.out.println(media);
            }
        } while (num != 0);

        System.out.printf("A média de todos números múltiplos de 3 é: %d", soma / media);
    }
}
