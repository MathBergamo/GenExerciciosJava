package VariaveisEOperadores;

import java.util.Scanner;

/*
Leia quatro valores float (n1, n2, n3, n4).
A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4.
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N1:");
        float n1 = scanner.nextInt();

        System.out.println("N2:");
        float n2 = scanner.nextInt();

        System.out.println("N3:");
        float n3 = scanner.nextInt();

        System.out.println("N4:");
        float n4 = scanner.nextInt();

        System.out.printf("Diferença: %.1f",(n1 * n2) - (n3 * n4));
    }
}
