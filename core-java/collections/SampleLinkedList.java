package collections;

import java.util.*;

public class SampleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(0,4);
        l1.set(2,21);

        l2.add(10);
        l2.add(11);
        l2.add(13);

        l1.addAll(l2);

        l1.addLast(5);
        l1.addFirst(6);

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        //Traversing through iterator
        System.out.println("display Linkedlist through iterator");
        Iterator<Integer> it=l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
