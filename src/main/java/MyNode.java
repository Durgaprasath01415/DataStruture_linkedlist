public class MyNode<T> {

    private T key;
    private MyNode<T> next;

    public MyNode (T key) {
        this.key = key;
        this.next = null;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}