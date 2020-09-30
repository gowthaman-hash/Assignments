package Sort;

/**
 * Custom linked list.
 * Implementation to push,sort and display the values from the list.
 *
 * */


public class LinkedListCustom {
   public  Node head;

    /**
     * Iterate till last of the node and insert the value.
     * @param val
     */
    public  void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node curNode = head;
            while (curNode.next != null) {

                curNode = curNode.next;
            }
            curNode.next = newNode;
        }

    }

    /**
     * Merge sort algorithm picked here to sort by considering linkedlist structure and time complexity.
     * Merge sort-->Divide and conquer.
     * Recursive mechanism used to split/iterate till last node. As single value from each side is convenient to sort.
     * To divide, have used getMiddle(list) method.
     * To merge and sort , invoked merge(leftList,rightList)
     * Based on param, it will get splitted in to 2 halves and it will get sorted according to merge sort algorithm.
     * @param pHead
     * @return
     */
    public  Node mergeSort(Node pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;

        Node slow = getMiddleNode(pHead);
        Node leftList = mergeSort(pHead);
        Node rightList = mergeSort(slow);

        return merge(leftList, rightList);
    }

    /**
     * Iterate till the half of the list and returns the node.
     * For each iteration, jump into 2 nodes with fast node and jump into next node using slow node.
     * Moment when fast node reaches end, slow node would have reached middle.
     * @param pHead
     * @return
     */
    public  Node getMiddleNode(Node pHead) {
        Node temp = pHead;
        Node slow = pHead;
        Node fast = pHead;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        return slow;
    }

    /**
     * Merge in asceding sorting order by considering odd as left and even at right.
     * First it will check for the lowest among 2 nodes.
     * Secondly, if the highest value is odd then it will get pushed towards left or else at right.
     * Returns sorted node.
     * @param left
     * @param right
     * @return
     */
    private  Node merge(Node left, Node right) {
        Node temp = new Node(0);
        Node curNode = temp;
        while (left != null && right != null) {//First it will check for the lowest among 2 nodes.
            if (left.val < right.val) {
                if (left.val % 2 == 0 && right.val % 2 != 0) {//if the highest value is odd then it will get pushed towards left or else at right
                    curNode.next = right;
                    right = right.next;
                } else {
                    curNode.next = left;
                    left = left.next;
                }

            } else {
                if (right.val % 2 == 0 && left.val % 2 != 0) {//if the highest value is odd then it will get pushed towards left or else at right
                    curNode.next = left;
                    left = left.next;
                } else {
                    curNode.next = right;
                    right = right.next;
                }

            }
            curNode = curNode.next;
        }
        //Left over value to be added to the end of the result node. Any one of the below IF cond will get passed.
        if (left != null) {
            curNode.next = left;
            left = left.next;
        }
        if (right != null) {
            curNode.next = right;
            right = right.next;
        }
        return temp.next;
    }

    /**
     * Iterating till last and diplaying the list of values horizontally.
     * @param node
     */
    public  void display(Node node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    /**
     * Optional main method to verify without JUnit.
     * @param args
     */
    public static void main(String[] args) {
        LinkedListCustom list=new LinkedListCustom();
        list.insert(5);
        list.insert(9);
        list.insert(81);
        list.insert(1);
        list.insert(2);
        list.insert(6);
        list.insert(4);
        list.insert(7);

        Node sortedNode = list.mergeSort(list.head);
        list.display(sortedNode);

    }
}
