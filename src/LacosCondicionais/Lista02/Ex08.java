package LacosCondicionais.Lista02;

import java.util.Scanner;

/*
Desenvolva um algoritmo em Java para uma conta bancária.
O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3)
e o valor a ser depositado ou sacado (somente nas opções 2 e 3).
Considere que um saque só pode ser realizado caso haja saldo suficiente.
Ao final de cada operação, exiba o novo Saldo na tela.
A variável saldo (float), será inicializada com o valor de R$ 1000.00.
Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laço Condicional Switch

 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float saldo = 1000f;

        System.out.println("Digite a operação que deseja realizar: ");
        int operacao = scanner.nextInt();

        if (operacao > 3 || operacao < 1){
            System.out.println("Operação inválida, digite uma opção entre 1 a 4");
            return;
        }

        switch (operacao) {
            case 1 -> {
                System.out.printf("Saldo: %.2f",saldo);
            }
            case 2 -> {
                System.out.println("Saque:");
                float saque = scanner.nextFloat();

                saldo -= saque;
                System.out.printf("Saldo R$%.2f", saldo);
            }
            case 3 -> {
                System.out.println("Depósito:");
                float deposito = scanner.nextFloat();

                saldo += deposito;
                System.out.printf("Saldo R$%.2f", saldo);
            }
        }
    }
}
