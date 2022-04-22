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
            head.setPrevious(null);
            tail.setNext(null);
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
            tail.setNext(null);
        }
        this.size++;
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
            this.head.setPrevious(null);
            this.size --;
            return temp;
        }else{
            return null;
        }
    }
    //metodo de prueba para verificar otros metodos
    public void displayList() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void duplicar(){
        int size = this.size;
        Node current = this.getHead();
        for(int i =0; i<size;i++){
            this.addNode(current.getData());
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
            this.addNode(file);
        }
        return this;
    }

    public void shuffle(){
        for(int i = 0; i < this.getSize(); i++){
            Node temp = this.head;
            double random =  Math.random() * 10 + 1;

            for(int x = 0; x < random; x++){
                if(random > 0 && temp.getNext() != null) {
                    temp = temp.getNext();
                }
            }

            if(temp.getPrevious() != null){
                temp.getPrevious().setNext(temp.getNext());
            }

            if(temp.getNext() != null){
                temp.getNext().setPrevious(temp.getPrevious());
            }

            temp.setNext(this.head);
            this.head.setPrevious(temp);
            temp.setPrevious(null);

            this.head = temp;
        }
    }

    public void cardStage(){
        this.shuffle();
        this.deleteFirst();
        this.deleteFirst();
        this.deleteFirst();
        this.deleteFirst();
        this.duplicar();
        this.displayList();
        this.shuffle();

    }

    public static void main(String[] args){
        listaDblEnlace nLista = new listaDblEnlace();
        File dir = new File("/Users/juanpablorodriguez/IdeaProjects/CE1103-Proyecto_1/img/Rocketships");
        nLista.addFiles(dir.listFiles());
        nLista.displayList();
        System.out.println(nLista.getSize());
        nLista.cardStage();
        System.out.println(nLista.getSize());

    }

}
