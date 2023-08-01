package LacosCondicionais.Lista02;

import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String),
o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float).
 A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laço Condicional Switch

 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cargo = "";

        System.out.println("Nome do colaborador:");
        String nomeColaborador = scanner.nextLine();

        System.out.println("Código do cargo:");
        int codigoCargo = scanner.nextInt();

        System.out.println("Salário R$");
        float salario = scanner.nextFloat();

        switch (codigoCargo){
            case 1 -> {
                salario += salario * 0.1f;
                cargo = "Gerente";
                System.out.printf("Nome: %s\nCargo: %s\nSalário Reajustado R$%.2f",nomeColaborador,cargo,salario);
            }
            case 2 -> {
                salario += salario * 0.07f;
                cargo = "Vendedor";
                System.out.printf("Nome: %s\nCargo: %s\nSalário Reajustado R$%.2f",nomeColaborador,cargo,salario);
            }
            case 3 -> {
                salario += salario * 0.09f;
                cargo = "Supervisor";
                System.out.printf("Nome: %s\nCargo: %s\nSalário Reajustado R$%.2f",nomeColaborador,cargo,salario);
            }
            case 4 -> {
                salario += salario * 0.06f;
                cargo = "Motorista";
                System.out.printf("Nome: %s\nCargo: %s\nSalário Reajustado R$%.2f",nomeColaborador,cargo,salario);
            }
            case 5 -> {
                salario += salario * 0.05f;
                cargo = "Estoquista";
                System.out.printf("Nome: %s\nCargo: %s\nSalário Reajustado R$%.2f",nomeColaborador,cargo,salario);
            }
            case 6 -> {
                salario += salario * 0.08f;
                cargo = "Técnico de TI";
                System.out.printf("Nome: %s\nCargo: %s\nSalário Reajustado R$%.2f",nomeColaborador,cargo,salario);
            }


        }
    }
}
