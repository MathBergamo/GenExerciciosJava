package Collections.Lista01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer,
inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro
e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número na Collection.
Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Laços Condicionais
- Laços de Repetição
- Collection ArrayList

 */
public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = scanner.nextInt();

        for (int i = 0; i < numeros.size(); i++) {
            if (num == numeros.get(i)) {
                System.out.printf("O número %d foi encontrado na posição: %d", numeros.get(i), i);
                break;
            } else {
                System.out.printf("O número %d não foi encontrado", numeros.get(i));
                break;
            }
        }
    }
}
