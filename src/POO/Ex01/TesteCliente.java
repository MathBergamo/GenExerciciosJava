package POO.Ex01;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente Jonas = new Cliente(1,"Jonas Kahnwald",65f,1.75f,"12345678910");
        Cliente Martha = new Cliente(2,"Martha Nielsen",63f,1.77f,"10987654321");
        PessoaFisica Angelo = new PessoaFisica(3,"Angelo Kolin", 80f,1.89f,"01773600036",123456789);
        PessoaFisica Amando = new PessoaFisica(4,"Amando Silva", 89f,1.83f,"18589731049",987654321);
        PessoaJuridica Fatima = new PessoaJuridica(5,"Fatima Andrade", 49f,1.42f,"18589731049","12345678000190");
        PessoaJuridica Adriana = new PessoaJuridica(6,"Adriana Samuca", 58f,1.63f,"16543128000131","16543128000131");

        Jonas.visualizar();

        System.out.println();

        Martha.visualizar();

        Angelo.visualizar();

        Amando.visualizar();

        Fatima.visualizar();

        Adriana.visualizar();
    }
}
