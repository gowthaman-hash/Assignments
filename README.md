# Assignments
Use case: Given a linked list of numbers,  arrange them to be all odds first and all evens after that. Within odds/even, the numbers  can be in any order.

Linked list uses different algorithm for usual CRUD mechanisms. So implemented custom linkedlist by own.

LinkedListCustom: Implementation to push,sort and display the values from the list.
 
 Question: Why merge sort algorithm picked here to sort linked list?
  Answer: Time complexity of merge sort in linked list in all cases is (N log N). Although, in general quicksort is considered as best mechanism. But it cannot be used to sort linked list.

    Methods:
    1) insert(int val)
      Desc: Iterate till last of the node and insert the value.
    2) display(Node node)
      Desc: Iterating till last and diplaying the list of values horizontally.
    3) mergeSort(Node pHead)
      Desc: Merge sort algorithm picked here to sort by considering linkedlist structure and time complexity.
            Merge sort-->Divide and conquer.
            Recursive mechanism used to split/iterate till last node. As single value from each side is convenient to sort.
            To divide, have used getMiddle(list) method.
            To merge and sort , invoked merge(leftList,rightList)
            Based on param, it will get splitted in to 2 halves and it will get sorted according to merge sort algorithm.
    4) merge(Node left, Node right) 
       Desc: Merge in asceding sorting order by considering odd as left and even at right.
             First it will check for the lowest among 2 nodes.
             Secondly, if the highest value is odd then it will get pushed towards left or else at right.
             Returns sorted node.
    5) display-->Self explanantory
    
 LinkedListCustomTest-->JUNIT test case
   1) void initialize()
      Desc: Initialize for each test and it invokes merge sort. Expected output post sort is 1 3 5 9 11 2 6 10 for the input 2 6 1 5 10 11 9 3
   2) void checkFirstValueAsOdd() 
      Desc: As per the input and expected output, this method should pass as it checks for odd.
            Expected value 1. Lowest Odd number.
   3) void checkLastValueAsEven() 
      Desc: As per the input and expected output, this method should pass as it checks for even.
            Expected value 10. Highest even number.
   4) void checkLastValOfFirstSet()
      Desc: As per the input and expected output, this method should pass as it checks for odd.
            Expected value 11. Highest Odd number.
            
   Node
   Holds the current val and ref of next val. Used as datatype for head node of list.
 
  
    
