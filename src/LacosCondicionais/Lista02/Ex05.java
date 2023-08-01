package LacosCondicionais.Lista02;

import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6)
e a quantidade comprada deste item (número inteiro).
A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laço Condicional Switch

 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String produto = "";
        float preco = 0f;

        System.out.println("Código do produto:");
        int codigo = scanner.nextInt();

        System.out.println("Quantidade do produto:");
        int quantidade = scanner.nextInt();

        switch (codigo) {
            case 1 -> {
                preco = 10.00f;
                produto = "Cachorro quente";
                System.out.printf("Produto: %s\nValor total: R$%.2f", produto, preco * quantidade);
            }
            case 2 -> {
                preco = 15.00f;
                produto = "X-Salada";
                System.out.printf("Produto: %s\nValor total: R$%.2f", produto, preco * quantidade);
            }
            case 3 -> {
                preco = 18.00f;
                produto = "X-Bacon";
                System.out.printf("Produto: %s\nValor total: R$%.2f", produto, preco * quantidade);
            }
            case 4 -> {
                preco = 12.00f;
                produto = "Bauru";
                System.out.printf("Produto: %s\nValor total: R$%.2f", produto, preco * quantidade);
            }
            case 5 -> {
                preco = 8.00f;
                produto = "Refrigerante";
                System.out.printf("Produto: %s\nValor total: R$%.2f", produto, preco * quantidade);
            }
            case 6 -> {
                preco = 13.00f;
                produto = "Suco de laranja";
                System.out.printf("Produto: %s\nValor total: R$%.2f", produto, preco * quantidade);
            }
        }
    }
}
