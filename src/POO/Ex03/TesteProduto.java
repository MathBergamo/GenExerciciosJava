package POO.Ex03;

public class TesteProduto {
    public static void main(String[] args) {
        Produto mouse = new Produto(1,"Mouse Comfort","Multilaser",1,120);
        Produto playstation = new Produto(2,"Playstation 5","Sony",2,1000000000);

        mouse.visualizar();

        System.out.println();

        playstation.visualizar();
    }
}
