package Collections.Lista02;

import java.util.*;

/*
Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer,
inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro
e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado!
Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!


Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Laços Condicionais
- Laços de Repetição
- Collection Set

 */
public class Ex04 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um valor: ");
        num = scanner.nextInt();

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()){
            if (num == iterator.next()){
                System.out.printf("Número %d encontrado!", num);
                break;
            } else if (!iterator.hasNext()){
                System.out.printf("Número %d não encontrado!", num);
            }
        }
    }
}
