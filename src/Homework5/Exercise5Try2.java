package Homework5;

import java.util.LinkedList;

public class Exercise5Try2 {
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Test 1");
        ll.add("Test 2");
        ll.add("Test 3");
        ll.add("Test 4");
        ll.add("Test 5");
        ll.add("Test 6");
        ll.add("Test 7");
        System.out.print("Print list " + ll);
        ll = reverseLinkedList(ll);
        System.out.print("\nPrint reversed list " + ll);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> reversedLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            reversedLinkedList.add(llist.get(i));
        }
        return reversedLinkedList;
    }
}
