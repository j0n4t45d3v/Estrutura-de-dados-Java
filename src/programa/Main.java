package programa;

import entidade.Fila;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.remove();
        fila.remove();
        fila.printList();
    }
}
