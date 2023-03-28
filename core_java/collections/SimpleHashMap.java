package collections;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();

        //entering elements
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        map.put(1,"hello"); //duplicating the key will result in replacing the value.

        System.out.println("Printing elements: ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent(5, "five");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //remove
//        map.remove(3);
        map.remove(3,"three");
        System.out.println(map);

        //replacing values
        map.replace(2,"two","newTwo");
        map.replaceAll((k,v)->"changedAll");
        System.out.println(map);

    }
}
