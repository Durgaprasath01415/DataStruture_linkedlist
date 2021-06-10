import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void Given3Numbers_WhenAddedToLinkedList_ShouldAddedtoTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }

    @Test
    public void Given3Numbers_WhenAddedToLinkedList_ShouldAddedtoBottom() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.addLast(myFirstNode);
        myLinkedList.addLast(mySecondNode);
        myLinkedList.addLast(myThirdNode);
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenANode_InsertedInBetween_ResultingNodesReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.addLast(myFirstNode);
        myLinkedList.addLast(myThirdNode);
        myLinkedList.insertNode(myFirstNode, mySecondNode);
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenNodes_WhenPoppedANodeFromFront_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode<Integer> deletedNode = myLinkedList.popFirst();
        Assert.assertEquals(deletedNode, myThirdNode);
    }

    @Test
    public void GivenNodes_WhenPoppedANodeFromLast_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode<Integer> deletedNode = myLinkedList.popLast();
        Assert.assertEquals(deletedNode, myFirstNode);
    }

    @Test
    public void SearchNode_ForGivenDataIfFound_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode searchNode= myLinkedList.searchNode(30);
        Assert.assertEquals(searchNode, mySecondNode);
    }

    @Test
    public void SearchDataNode_ForGivenDataIfFound_ShouldInsertGivenNodeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode searchNode= myLinkedList.searchNode(30);
        myLinkedList.insertNode(searchNode, myFourthNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(searchNode)
                && myLinkedList.head.getNext().getNext().equals(myFourthNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }

    @Test
    public void DeleteANodeFromLinkedList_IfDeleted_ShouldReturnSizeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(40);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myFourthNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFourthNode);
        myLinkedList.popNode(40);
        int size = myLinkedList.getSize();
        Assert.assertEquals(3, size);
    }
}