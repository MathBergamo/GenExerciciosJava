package LacosCondicionais.Lista01;

import java.util.Scanner;

/*
Para doar sangue é necessário ter entre 18 e 69 anos de idade.
Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String),
a idade (inteiro) do doador e se é a primeira doação (boolean).
De acordo com as Regras para a doação, mostre na tela se o doador
está Apto ou Não Apto para doar sangue.

Na construção do Algoritmo, utilize os seguintes conteúdos:
- Entrada e Saída de dados
- Operadores
- Laço Condicional IF

 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doacaoPermitida = true;

        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 69){
            if (idade >= 60){
                System.out.println("É sua primeira doação de sangue? [S/N]");
                String doacaoResposta = scanner.next();

                if (doacaoResposta.equalsIgnoreCase("s")){
                    doacaoPermitida = false;
                }
            }

        } else if (idade > 69){
            doacaoPermitida = false;
        }

        if (doacaoPermitida){
            System.out.printf("%s está apto para doar sangue!", nome);
        } else {
            System.out.printf("%s não está apto para doar sangue!", nome);
        }
    }
}
