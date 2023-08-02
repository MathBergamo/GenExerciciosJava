package LacosRepeticao.Lista02;

import java.util.Scanner;

/*
Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos
e o total de pessoas cuja idade seja maior que 50 anos.
A leitura dos dados deve ser finalizada ao digitar uma idade negativa.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laços Condicionais
- Laço de Repetição WHILE

 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeMenorQue21 = 0, idadeMaiorQue50 = 0, idade;

        while (true) {
            System.out.print("Digite uma idade:");
            idade = scanner.nextInt();

            if (idade < 21 && idade > 0) {
                idadeMenorQue21++;
            } else if (idade > 50) {
                idadeMaiorQue50++;
            } else if (idade < 0) {
                break;
            }
        }

        System.out.printf("\nTotal de pessoas menores de 21 anos: %d", idadeMenorQue21);
        System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", idadeMaiorQue50);
    }
}
