package LacosCondicionais.Lista02;

import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples.
O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4).
A seguir, mostre na tela o resultado da operação entre os 2 números.
Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da operação matemática:");
        int codigo = scanner.nextInt();

        if (codigo > 4 || codigo < 1){
            System.out.println("Operação inválida, digite uma opção entre 1 a 4");
            return;
        }

        System.out.print("Digite o valor do primeiro número:");
        float num1 = scanner.nextFloat();

        System.out.println("Digite o valor do segundo número");
        float num2 = scanner.nextFloat();

        switch (codigo) {
            case 1 -> System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1 + num2);
            case 2 -> System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1 - num2);
            case 3 -> System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1 * num2);
            case 4 -> System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1 / num2);
        }
    }
}
