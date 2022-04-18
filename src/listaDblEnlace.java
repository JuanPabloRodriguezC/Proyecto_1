import java.io.File;

public class listaDblEnlace {
    private Node head;
    private int size;

    //Constructor
    public listaDblEnlace(){
        this.head = null;
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

    public void setHead(Node head) {
        this.head = head;
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
            this.insertFirst(file);
        }
        return this;
    }


}
