package POO.Ex01;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente Jonas = new Cliente(1,"Jonas Kahnwald",65f,1.75f,"12345678910");
        Cliente Martha = new Cliente(2,"Martha Nielsen",63f,1.77f,"10987654321");

        Jonas.visualizar();

        System.out.println();

        Martha.visualizar();
    }
}
