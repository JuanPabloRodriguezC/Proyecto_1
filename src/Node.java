public class Node {
    private Object data;
    private Node next;

    public Node(Object data){
        this.data = data;
        this.next = null;
    }

    public void setData(Object data){
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node){
        this.next = node;
    }

}
