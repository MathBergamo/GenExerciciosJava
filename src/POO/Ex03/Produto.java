package POO.Ex03;

import java.text.NumberFormat;

/*
Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Produto
com os seus respectivos Métodos e Atributos, que descreva os produtos de uma Loja de Games.
Na sequência, crie uma Classe chamada TestaGame, instancie dois objetos da Classe Produto e apresente
as informações destes 2 Objetos no console.

Crie a Classe Produto e defina pelo menos 5 Atributos relevantes aos Produtos de uma Loja de Games, a sua escolha;
Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer produto da Loja de Games;
Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Produto nos argumentos do Método;
Crie os Métodos Get e Set para todos os Atributos da Classe Produto;
Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Produto;
Crie a Classe TestaGame no mesmo pacote da Classe Game, contendo o Método main() e instancie 2 Objetos da Classe Produto;
Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 */
public class Produto {
    private Integer id;
    private String nome;
    private String marca;
    private Integer anosDeSeguro;
    private Integer preco;

    public void visualizar(){
        System.out.println("Informações do funcionário");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Anos de seguro: " + anosDeSeguro);

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String moedaFormatada = nf.format(preco);

        System.out.println("Salário: " + moedaFormatada);
    }

    public Produto(Integer id, String nome, String marca, Integer anosDeSeguro, Integer preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.anosDeSeguro = anosDeSeguro;
        this.preco = preco;
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

    public String getModelo() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.marca = modelo;
    }

    public Integer getAnosDeSeguro() {
        return anosDeSeguro;
    }

    public void setAnosDeSeguro(Integer tempoDeSeguro) {
        this.anosDeSeguro = tempoDeSeguro;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }
}
