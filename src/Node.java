public class Node {
    private Object data;
    private Node next;

    public Node(Object data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public void setData(Object data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }

}
