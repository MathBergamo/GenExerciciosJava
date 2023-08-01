package VariaveisEOperadores;

import java.util.Scanner;

/*
Elabore um algoritmo em Java, que leia o Salário Bruto,
o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador,
em variáveis do tipo float e exiba na tela o Salário Líquido.
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto R$");
        float salarioBruto = scanner.nextFloat();

        System.out.print("Adicional Noturno R$");
        float adicionalNoturno = scanner.nextFloat();

        System.out.print("Horas Extras R$");
        float horasExtras = scanner.nextFloat();

        System.out.print("Descontos R$");
        float descontos = scanner.nextFloat();

        System.out.printf("Salário liquido R$%.2f",salarioBruto + adicionalNoturno + horasExtras - descontos);

    }
}
