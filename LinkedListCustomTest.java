import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sort.LinkedListCustom;
import Sort.Node;

/**
 * To test the sorting algorithm on ascending order from odd to even for the given input.
 */
public class LinkedListCustomTest {

    LinkedListCustom   linkedListCustom=new LinkedListCustom();
    Node node;

    /**
     * Intialize for each test and expected output post sort is 1 3 5 9 11 2 6 10
     */
    @BeforeEach
    void initialize(){
        linkedListCustom.insert(2);
        linkedListCustom.insert(6);
        linkedListCustom.insert(1);
        linkedListCustom.insert(5);
        linkedListCustom.insert(10);
        linkedListCustom.insert(11);
        linkedListCustom.insert(9);
        linkedListCustom.insert(3);
        //sort
        node=linkedListCustom.mergeSort(linkedListCustom.head);
    }

    /**
     * As per the input and expected output, this method should pass as it checks for odd.
     * Expected value 1. Lowest Odd number.
     */
    @Test
     void checkFirstValueAsOdd() {

        assertEquals(1,node.val%2);
    }
    /**
     * As per the input and expected output, this method should pass as it checks for even.
     * Expected value 10. Highest even number.
     */
    @Test
     void checkLastValueAsEven() {
        while(node.next!=null){//iterating till last.
            node=node.next;
        }
        assertEquals(0,node.val%2);
    }

     /**
     * As per the input and expected output, this method should pass as it checks for odd.
     * Expected value 11. Highest Odd number.
     */

    @Test
    void checkLastValOfFirstSet() {
        Node middleNode=linkedListCustom.getMiddleNode(node);
        assertEquals(1,middleNode.val%2);
    }
}
