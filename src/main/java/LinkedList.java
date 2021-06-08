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

    public void printNodes() {
        INode<E> tempNode = head;
        while(tempNode.getNext() != null) {
            System.out.print(tempNode.getKey() + "->");
            tempNode = tempNode.getNext();
        }
        System.out.print(tempNode.getKey());
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        list.add(thirdNode);
        list.add(secondNode);
        list.add(firstNode);
        list.printNodes();
    }
}