package Homework5;

import java.util.LinkedList;

public class Exercise5 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(55);
        ll.add(65);
        ll.add(75);
        ll.add(85);
        ll.add(95);
        ll.add(155);
        System.out.println(ll);
        LinkedList ll2 = new LinkedList();

        while(ll.size() !=0 ){
            ll2.add(ll.getLast());
            ll.removeLast();
        }
        System.out.println(ll2);

        //=========================

    }

}
