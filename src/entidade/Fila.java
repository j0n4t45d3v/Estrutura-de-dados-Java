package entidade;

public class Fila<T> {
    private Node<T> head;
    private Node<T> tail;
    private int contador;

    public Fila() {
        this.head = null;
        this.tail = null;
        this.contador = 0;
    }

    public void add(T value){
        Node<T> no = new Node<>(value);
        if(this.head == null){
            this.head = no;
        }else{
            this.tail.setNext(no);
        }
        this.tail = no;
        this.contador ++;
    }

    public void remove(){
        this.head = this.head.getNext();
        this.contador --;
    }

    public void printList(){
        Node<T> p =  this.head;
        for(int i = 0; i < this.contador;i++){
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }
}
