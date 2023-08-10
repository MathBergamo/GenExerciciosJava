package POO.Ex01;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public void visualizar(){
        System.out.println("\nInformações do cliente");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        String cpfString = String.valueOf(getCpf());
        String cnpjString = String.valueOf(getCpf());
        System.out.println("CPF: "+ cpfString.substring(0,3) + "." + cpfString.substring(3,6) + "." + cpfString.substring(6,9) + "-"
                + cpfString.substring(9));
        System.out.println("CPNJ: " + cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/" +
                cnpj.substring(8, 12) + "-" + cnpj.substring(12));
    }

    public PessoaJuridica(Integer id, String nome, Float peso, Float altura, String cpf, String cnpj) {
        super(id, nome, peso, altura, cpf);
        this.cnpj = cnpj;
    }

    public String getcnpj() {
        return cnpj;
    }

    public void setCPNJ(String cnpj) {
        this.cnpj = cnpj;
    }
}
