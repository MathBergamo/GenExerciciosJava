package Collections.Lista01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente
no ArrayList. Em seguida, faça o que se pede:
Mostre na tela todas as cores que foram adicionadas.
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Laços de Repetição
- Collection ArrayList


 */
public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("\nDigite a %dº cor:",i);
            cores.add(scanner.next());
        }

        System.out.printf("\nTodas as cores adicionadas: %s",cores);
        Collections.sort(cores);
        System.out.printf("\nTodas as cores adicionadas em ordem crescente: %s",cores);
    }
}
