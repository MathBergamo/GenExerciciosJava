package VariaveisEOperadores;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário R$");
        float salario = scanner.nextFloat();

        System.out.print("Digite o abono:");
        float abono = scanner.nextFloat();

        System.out.printf("Novo salário R$%.2f", salario+abono);
    }
}
