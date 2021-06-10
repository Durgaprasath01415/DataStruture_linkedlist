public class MyNode<E> implements INode<E> {
    private E data;
    private INode next;

    MyNode() {
    }

    // Constructor with node fields
    public MyNode(E data) {
        this.setData(data);
        this.setNext(null);
    }
    @Override
    public  E getData() {
        return data;
    }
    @Override
    public void setData(E data) {
        this.data = data;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to the Data Structure Problem");
    }
}