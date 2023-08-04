package VetoresEMatrizes.Lista01;

import java.util.Scanner;

/*
Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar
um número e o programa deve exibir na tela a posição deste número no vetor.
Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Saída de dados
- Laços Condicionais
- Laços de Repetição
- Vetores

 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        boolean encontrado = false;

        System.out.println("Digite o número desejado:");
        int num = scanner.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (num == vetor[i]) {
                System.out.printf("O valor desejado %d está no índice: [%d]", num, i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.printf("O valor %d não foi encontrado no vetor!", num);
        }
    }
}
