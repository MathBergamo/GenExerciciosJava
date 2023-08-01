package LacosCondicionais.Lista01;

import java.util.Scanner;

/*
Escreva um algoritmo em Java, que leia um número inteiro via teclado
e mostre na tela uma mensagem indicando se este número é par ou ímpar
e se o número é positivo ou negativo.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laço Condicional IF

*/
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número:");
        int num = scanner.nextInt();

        if (num < 0 && num % 2 == 0){
            System.out.printf("O número %d é par e negativo", num);
        } else if (num > 0 && num % 2 == 0){
            System.out.printf("O número %d é par e positivo", num);
        } else if (num < 0){
            System.out.printf("O número %d é impar e negativo", num);
        } else if (num % 2 != 0){
            System.out.printf("O número %d é impar e positivo", num);
        }
    }
}
