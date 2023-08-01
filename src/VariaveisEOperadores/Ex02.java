package VariaveisEOperadores;

import java.util.Scanner;
/*
Elabore um algoritmo em Java que leia 4 notas de um participante,
em variáveis do tipo float e exiba na tela a média final do participante.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a 1ºNota:");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a 2ºNota:");
        float nota2 = scanner.nextFloat();

        System.out.print("Digite a 3ºNota:");
        float nota3 = scanner.nextFloat();

        System.out.print("Digite a 4ºNota:");
        float nota4 = scanner.nextFloat();

        System.out.printf("Média final: %.1f",(nota1+nota2+nota3+nota4)/4);
    }
}
