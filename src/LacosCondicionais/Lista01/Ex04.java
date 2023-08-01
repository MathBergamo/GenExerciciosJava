package LacosCondicionais.Lista01;

import java.util.Scanner;

/*
Escreva um algoritmo em Java, que leia 3 palavras (String),
que definem as características de um tipo de animal possível segundo o diagrama abaixo,
que deve ser lido da esquerda para a direita.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laço Condicional If
- Utilize o Método String.equals() ou String.equalsIgnoreCase() para comparar as palavras
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a primeira característica [Vertebrado] - [Invertebrado]");
        String caracteristica1 = scanner.nextLine();

        if (caracteristica1.equalsIgnoreCase("Vertebrado")) {
            System.out.println("Escolha a segunda característica [Ave] - [Mamífero]");
            String caracteristica2 = scanner.nextLine();

            if (caracteristica2.equalsIgnoreCase("Ave")) {
                System.out.println("Escolha a terceira característica [Carnívoro] - [Onívoro]");
                String caracteristica3 = scanner.nextLine();

                if (caracteristica3.equalsIgnoreCase("Carnívoro")) {
                    System.out.println("Seu animal é a Águia!");
                } else if (caracteristica3.equalsIgnoreCase("Onívoro")) {
                    System.out.println("Seu animal é a Pomba!");
                }

            } else if (caracteristica2.equalsIgnoreCase("Mamífero")) {
                System.out.println("Escolha a terceira característica [Onívoro] - [Herbívoro]");
                String caracteristica3 = scanner.nextLine();

                if (caracteristica3.equalsIgnoreCase("Onívoro")) {
                    System.out.println("Seu animal o Homem!");
                } else if (caracteristica3.equalsIgnoreCase("Herbívoro")) {
                    System.out.println("Seu animal é a Vaca!");
                }
            }

        } else if (caracteristica1.equalsIgnoreCase("Invertebrado")) {
            System.out.println("Escolha a segunda característica [Inseto] - [Anelídeo]");
            String caracteristica2 = scanner.nextLine();

            if (caracteristica2.equalsIgnoreCase("Inseto")) {
                System.out.println("Escolha a terceira característica [Hematófago] - [Herbívoro]");
                String caracteristica3 = scanner.nextLine();

                if (caracteristica3.equalsIgnoreCase("Hematófago")) {
                    System.out.println("Seu animal é a Pulga!");
                } else if (caracteristica3.equalsIgnoreCase("Herbívoro")) {
                    System.out.println("Seu animal é a Lagarta!");
                }

            } else if (caracteristica2.equalsIgnoreCase("Anelídeo")) {
                System.out.println("Escolha a terceira característica [Hematófago] - [Onívoro]");
                String caracteristica3 = scanner.nextLine();

                if (caracteristica3.equalsIgnoreCase("Hematófago")) {
                    System.out.println("Seu animal é a Sanguessuga!");
                } else if (caracteristica3.equalsIgnoreCase("Onívoro")) {
                    System.out.println("Seu animal é a Minhoca!");
                }
            }
        }
    }
}
