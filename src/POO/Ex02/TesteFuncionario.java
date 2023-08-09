package POO.Ex02;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario Oswaldo = new Funcionario(1,"Oswaldo da Cruz","Arquiteto",34,7000f);
        Funcionario Anastacia = new Funcionario(1,"Anastacia Nascimento","Engenheira Civil",29,9000f);

        Oswaldo.visualizar();

        System.out.println();

        Anastacia.visualizar();

    }
}
