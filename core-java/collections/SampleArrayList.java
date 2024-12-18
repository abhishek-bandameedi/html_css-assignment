package collections;

import java.lang.reflect.Array;
import java.util.*;
public class SampleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(3);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(0,4);  //adds new element at specified position by shifting older element towards right position
        l1.set(2,21);  //adds new element at specified position by replacing the older element at that position.

        l2.add(10);
        l2.add(11);
        l2.add(13);
//        l2.add(14);

        l1.addAll(l2);
//        l1.addAll(0,l2);

//        l1.clear();  //removes all elements from the list
        int removedElement=l1.remove(1);
        System.out.println(removedElement);

        System.out.println(l1.contains(5)); //returns boolean value if element includes in the list

        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(2));



        System.out.println(l1);
        for(int item:l1){
            System.out.print(item+" ");
        }
        System.out.println();
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        //Traversing through iterator
        System.out.println("display arraylist through iterator");
        Iterator<Integer> it=l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //to remove element through iterator
        while(it.hasNext()){
            Integer val=it.next();
            if(val.equals(2))
                it.remove();
        }
    }
}
//1 2 4 3 4 5
