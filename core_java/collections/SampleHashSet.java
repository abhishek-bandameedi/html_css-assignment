package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SampleHashSet {
    public static void main(String[] args) {
        HashSet<String> s1=new HashSet<String>();

        s1.add("abhi");
        s1.add("ab");
        s1.add("sh");
        s1.add("abhi");
        System.out.println(s1);

//        s1.clear();  //removes all elements from the set
        System.out.println(s1.isEmpty());  //returnns boolean value

        System.out.println(s1.contains("abhi"));  //returns boolean value

        s1.remove("ab");
        System.out.println(s1);
        System.out.println(s1.size());

        System.out.println();
        //Traversing through iterator
        System.out.println("display arraylist through iterator");
        Iterator<String> it=s1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
