package POO.Ex01;
/*
Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos,
crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na sequência, crie uma Classe chamada TestaCliente,
 instancie dois objetos da Classe Cliente e apresente as informações destes 2 Objetos no console.

Crie a Classe Cliente e defina pelo menos 5 Atributos relevantes ao Objeto Cliente, a sua escolha;
Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Cliente;
Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Cliente nos argumentos do Método;
Crie os Métodos Get e Set para todos os Atributos da Classe Cliente;
Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Cliente;
Crie a Classe TestaCliente no mesmo pacote da Classe Cliente, contendo o Método main() e instancie 2 Objetos da Classe Cliente;
Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.

 */
public class Cliente {
    private Integer id;
    private String nome;
    private Float peso;
    private Float altura;
    private String cpf;

    public void visualizar(){
        System.out.println("Informações do cliente");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        String cpfString = String.valueOf(cpf);
        System.out.println(cpfString.substring(0,3) + "." + cpfString.substring(3,6) + "." + cpfString.substring(6,9) + "-"
                + cpfString.substring(9));
    }

    public Cliente(Integer id, String nome, Float peso, Float altura, String cpf) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.cpf = cpf;
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

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
