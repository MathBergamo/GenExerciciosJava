package LacosRepeticao.Lista01;

import java.util.Scanner;

/*
Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
onde o primeiro número deve ser menor do que o segundo número.
Caso contrário, deve ser exibida uma mensagem na tela informando
que o intervalo é inválido e sair do programa.
Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Laços Condicionais
- Laço de Repetição FOR

 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o primeiro parâmetro:");
        int num1 = scanner.nextInt();

        System.out.print("Escreva o segundo parâmetro:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Intervalo inválido, digite novamente!");
            return;
        }

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d é divisível por 3 e 5", i);
            }
        }
    }
}