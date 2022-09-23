package entidade;

public class Pilha<T> {
    private Node<T> head;
    private Node<T> tail;

    public Pilha() {
        this.head = null;
        this.tail = null;
    }

    public void add(T value){
        Node<T> no = new Node<>(value);

        if(this.head == null){
            this.head = no;
        }else{
            this.tail.setNext(no);
        }
        this.tail = no;
    }
}
