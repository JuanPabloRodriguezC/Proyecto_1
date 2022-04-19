import java.io.File;

public class listaDblEnlace {
    private Node head;
    private Node tail;
    private int size;

    //Constructor
    public listaDblEnlace(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }


    public void addNode(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
        } else {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
            tail.next = null;
        }
    }

    public void insertFirst(Object data){
        Node newNode = new Node(data);
        if(this.head != null){
            newNode.setNext(this.head);
            this.head = newNode;
            this.size++;
        }else{
            this.head = newNode;
        }

    }

    public Node deleteFirst(){
        if(this.head != null){
            Node temp = this.head;
            this.head = this.head.getNext();
            this.size --;
            return temp;
        }else{
            return null;
        }
    }
    //metodo de prueba para verificar que se guarde el path en el nodo
    public void displayList() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public listaDblEnlace duplicar(listaDblEnlace lista){
        int size = lista.size;
        Node current = lista.getHead();
        for(int i =0; i<size;i++){
            lista.insertFirst(current.getData());
            current = current.getNext();
        }
        return lista;
    }

    public Node find(Object searchValue) {
        Node current = this.head;
        while (current != null) {
            if (current.getData().equals(searchValue)) {
                return current;
            } else {
                current = current.getNext();
            }
        }
        return null;
    }

    public listaDblEnlace addFiles(File[] files){
        for(File file : files){
            this.addNode(file);
        }
        return this;
    }


}
