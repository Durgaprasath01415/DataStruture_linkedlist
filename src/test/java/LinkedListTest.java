import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void givenThreeNumber_whenAddedToLinkedListShouldNeAddedToTheTop() {

        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(56);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);

        myLinkedList.printNodes();

        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}