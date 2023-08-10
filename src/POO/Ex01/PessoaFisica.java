package POO.Ex01;
/*
Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos, crie as Classes PessoaFisica
e PessoaJuridica, como Heranças da Classe Cliente (criada na lista de exercícios anterior), com os seus respectivos
Métodos e Atributos. Na sequência, utilize a Classe TestaCliente para instanciar dois objetos da Classe PessoaFisica
e dois objetos da Classe PessoaJuridica, e apresente as informações destes 4 Objetos na tela.

Crie a Classe PessoaFisica como uma herança da Classe Cliente e defina pelo menos 1 Atributo relevante, a pessoa física,a sua escolha;
Lembre-se de escolher Atributos que descrevem características específicas e exclusivas de uma pessoa física;
Crie o Método Construtor com parâmetros na Classe PessoaFisica;
Crie os Métodos Get e Set para todos os Atributos da Classe PessoaFisica;
Crie o Método visualizar() na Classe PessoaFisica, que consiga exibir todos os dados do Objeto;
Instancie 2 Objetos da Classe PessoaFisica na Classe TestaCliente;
Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
Crie a Classe PessoaJuridica como uma herança da Classe Cliente e defina pelo menos 1 Atributo relevante, a pessoa jurídica, a sua escolha;
Lembre-se de escolher Atributos que descrevam características específicas e exclusivas de uma pessoa jurídica;
Crie o Método Construtor com parâmetros na Classe PessoaJuridica;
Crie os Métodos Get e Set para todos os Atributos da Classe PessoaJuridica;
 */
public class PessoaFisica extends Cliente{

    private Integer telefone;

    public void visualizar(){
        System.out.println("\nInformações do cliente");
        System.out.println("ID: " + super.getId());
        System.out.println("Nome: " + super.getNome());
        System.out.println("Peso: " + super.getPeso());
        System.out.println("Altura: " + super.getAltura());
        String cpfString = String.valueOf(super.getCpf());
        System.out.println("CPF: " + cpfString.substring(0,3) + "." + cpfString.substring(3,6) + "." + cpfString.substring(6,9) + "-"
                + cpfString.substring(9));
        System.out.println("Telefone: " + telefone);
    }

    public PessoaFisica(Integer id, String nome, Float peso, Float altura, String cpf, Integer telefone) {
        super(id, nome, peso, altura, cpf);
        this.telefone = telefone;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}
