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

    public E pop() {
        INode<E> tempNode = head.getNext();
        E key = head.getKey();
        head = tempNode;
        return key;
    }

    public E popLast() {
        INode<E> currentNode = head;
        INode<E> previousNode = null;
        while(currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        E key = currentNode.getKey();
        currentNode = null;
        assert previousNode != null;
        previousNode.setNext(null);
        tail = previousNode;
        return key;
    }

    public void searchByKey(int data) {
        boolean flag = false;
        int index = 1;
        INode<E> temp = head;

        if(head == null) {
            System.out.println("List is empty");
        }

        else {
            while(temp != null) {
                if(temp.getKey().equals(data)) {
                    flag=true;
                    break;
                }
                index++;
                temp = temp.getNext();
            }
        }
        if(flag)
            System.out.println("Element present at the position:"+index);
        else
            System.out.println("Element not present");
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