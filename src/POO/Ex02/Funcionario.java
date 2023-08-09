package POO.Ex02;

import java.text.NumberFormat;

/*
Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Funcionario
com os seus respectivos Métodos e Atributos. Na sequência, crie uma Classe chamada TestaFuncionario,
instancie dois objetos da Classe Funcionario e apresente as informações destes 2 Objetos no console.

Crie a Classe Funcionario e defina pelo menos 5 Atributos relevantes ao Objeto Funcionario, a sua escolha;
Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Funcionario;
Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Funcionario nos argumentos do Método;
Crie os Métodos Get e Set para todos os Atributos da Classe Funcionario;
Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Funcionario;
Crie a Classe TestaFuncionario no mesmo pacote da Classe Funcionario, contendo o Método main() e instancie 2 Objetos da Classe Funcionario;
Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.

 */
public class Funcionario {
    private Integer id;
    private String nome;
    private String funcao;
    private Integer idade;
    private Float salario;

    public void visualizar(){
        System.out.println("Informações do funcionário");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Função: " + funcao);
        System.out.println("Idade: " + idade);

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String moedaFormatada = nf.format(salario);

        System.out.println("Salário: " + moedaFormatada);
    }

    public Funcionario(Integer id, String nome, String funcao, Integer idade, Float salario) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.idade = idade;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
