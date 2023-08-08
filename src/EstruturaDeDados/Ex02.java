package EstruturaDeDados;

import java.util.Iterator;
import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();

        pilha.push("Prato verde");
        pilha.push("Prato azul");
        pilha.push("Prato branco");
        pilha.push("Prato preto");

        System.out.println("\nElementos da pilha: " + pilha);

        System.out.println("\nO elemento retirado vai ser o : "+pilha.pop());

        System.out.println(pilha);

        System.out.println("\nO elemento retirado vai ser o : "+pilha.pop());

        System.out.println(pilha);

        System.out.println("\nElemento do topo da pilha "+pilha.peek());

        System.out.println("\nAdicionar um elemento na pilha" + pilha.push("Prato roxo"));


        System.out.println("Tamanho da pilha: " + pilha.size());


        System.out.println("O elemento prato verde existe na pilha? " + pilha.contains("Prato Verde"));

        System.out.println("\nExibir todos os elementos da pilha atraves do Iterator:");

        Iterator<String> iterator =  pilha.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        pilha.clear();
        System.out.println("\n A pilha esta vazia? "+pilha.isEmpty());

    }
}
