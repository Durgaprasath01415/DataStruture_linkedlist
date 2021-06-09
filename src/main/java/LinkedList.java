public class LinkedList<E> {

    public INode<E> head;
    public INode<E> tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<E> node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            INode<E> tempNode = head;
            head = node;
            head.setNext(tempNode);
        }
    }

    public void append(INode<E> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail != null) {
            this.tail.setNext(myNode);
        }
        this.tail = myNode;
    }

    public void insert(INode<E> myNode, INode<E> newNode) {
        INode<E> tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext((tempNode));
    }

    public void printNodes() {
        INode<E> tempNode = head;
        while(tempNode.getNext() != null) {
            System.out.print(tempNode.getKey() + "->");
            tempNode = tempNode.getNext();
        }
        System.out.print(tempNode.getKey());
    }
}