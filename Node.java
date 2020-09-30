package Sort;

/**
 * Holds the current val and ref of next val.
 */
public class Node {
   public int val;
   public Node next;

    /**
     * creates the node with val and sets null for the next node.
     * @param pVal
     */
    public Node(int pVal){
        val=pVal;
        next=null;
    }
}
