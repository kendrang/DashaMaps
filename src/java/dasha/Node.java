package dasha;

public class Node {


    String key;
    Integer value;
    Node next;


    public Node (String key, Integer value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public boolean hasNext() {
        return (this.next != null);
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public Integer getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

}
