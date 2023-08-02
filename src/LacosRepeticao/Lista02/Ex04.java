package LacosRepeticao.Lista02;

import java.util.Scanner;

/*
Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores
da área de Desenvolvimento e precisam de um sistema para analisar os dados.
 Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:
Idade (Número inteiro)
Sexo (Número Inteiro):
1 – Masculino
2 – Feminino
3 – Outros
Categoria (Número Inteiro):
1 – Backend
2 – Frontend
3 – Mobile
4 – FullStack
Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de
um novo colaboradore ou não (S/N). Caso seja pressionada a tecla N, mostre na tela:

O número de pessoas desenvolvedoras Backend
O número de mulheres desenvolvedoras Frontend
O número de homens desenvolvedores Mobile maiores de 40 anos
O número de mulheres desenvolvedoras FullStack menores de 30 anos

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laços Condicionais
- Laço de Repetição WHILE

 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, sexo, categoria, devBack = 0, devFrontMulher = 0, devHomemMobileMaiorQue40 = 0, devMulherFullstackMenorQue30 = 0;
        while (true){
            System.out.print("Idade:");
            idade = scanner.nextInt();

            System.out.println("Sexo: [1] - Masculino / [2] - Feminino / [3] - Outros");
            sexo = scanner.nextInt();

            System.out.println("Categoria: [1] - Backend / [2] - Frontend / [3] - Mobile / [4] - Fullstack");
            categoria = scanner.nextInt();

            if (categoria == 1){
                devBack ++;
            } else if (sexo == 2 && categoria == 2){
                devFrontMulher ++;
            } else if (idade > 40 && categoria == 3){
                devHomemMobileMaiorQue40 ++;
            } else if (idade < 30 && sexo == 2 && categoria == 4){
                devMulherFullstackMenorQue30 ++;
            }

            System.out.println("Deseja continuar? [S/N]");
            String continuar = scanner.next();
            if (continuar.equalsIgnoreCase("n")){
                break;
            }
        }

        System.out.printf("O número de desenvolvedores Back-end foi: %d", devBack);
        System.out.printf("\nO número de desenvolvedoras mulheres Front-end foi: %d", devFrontMulher);
        System.out.printf("\nO número de desenvolvedores homens Mobile com idade maior que 40 foi: %d", devHomemMobileMaiorQue40);
        System.out.printf("\nO número de desenvolvedoras mulheres Fullstack com idade menor que 30 foi: %d", devMulherFullstackMenorQue30);
    }
}
