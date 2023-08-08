package EstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:

1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila
0: O programa deve ser finalizado.
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..
 */
public class Ex01 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();

        for (int i =0; i<=10;i++){
            fila.add(i);
        }

        System.out.println("\nElementos da fila" + fila);
        System.out.println("\nRemovendo elemento da fila: " + fila.remove());
        System.out.println("\nElementos da fila depois de remover: "+fila);
        System.out.println("\nAdicionando o elemento 11: "+ fila.add(11));
        System.out.println("\nPegar o elemento da fila: " + fila.peek());
        System.out.println("\nPegar o tamanho da fila: " + fila.size());
        System.out.println("\nVerificando um elemento da fila " + fila.contains(37));
        System.out.println("\nExibir e retirar o primeiro elemento da fila: "+ fila.poll());
        System.out.println("\nFila atual: " + fila);

        Iterator<Integer> iterator = fila.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Limpar a fila: ");
        fila.clear();

        System.out.println("a fila esta vazia ? " +fila.isEmpty());
    }
}
