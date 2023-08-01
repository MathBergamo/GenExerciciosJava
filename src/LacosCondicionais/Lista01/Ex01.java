package LacosCondicionais.Lista01;

import java.util.Scanner;

/*
Faça um algoritmo em Java que leia 3 valores inteiros A, B e C
Imprima na tela se a soma de A + B é maior, menor ou igual a C.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laço Condicional IF

 */
public class Ex01 {
    public static void main(String[] args) {
        int A,B,C;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A:");
        A = scanner.nextInt();

        System.out.print("Digite o valor de B:");
        B = scanner.nextInt();

        System.out.print("Digite o valor de C:");
        C = scanner.nextInt();

        if (A+B > C){
            System.out.printf("%d + %d = %d > %d",A,B,A+B,C);
            System.out.println("\nA Soma de A + B é Maior do que C");
        }else if (A+B == C){
            System.out.printf("%d + %d = %d = %d",A,B,A+B,C);
            System.out.println("\nA Soma de A + B é Igual a C");
        } else if (A+B < C){
            System.out.printf("%d + %d = %d < %d",A,B,A+B,C);
            System.out.println("\nA Soma de A + B é Menor do que C");
        }
    }
}
