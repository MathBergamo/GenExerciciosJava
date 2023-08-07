package Collections.Lista02;

import java.util.*;

/*
Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos
e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Collection Set
- Classe Iterator

 */
public class Ex03 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aviso: Números repetidos não serão considerados!\n");

        for (int i = 1; i < 11; i++) {
            System.out.printf("Digite o %d número: ", i);
            numeros.add(scanner.nextInt());
        }

        System.out.print("Números digitados: ");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
