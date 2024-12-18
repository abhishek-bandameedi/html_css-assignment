package lambdasAndStreams;

import java.util.*;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args) {

        //number is a list of integer numbers
        List<Integer> number = Arrays.asList(2,3,4,5,3);

        //map method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("Map: "+square);

        //names is a list of strings
        List<String> names = Arrays.asList("One","Two","Three");
        //filter method
        List<String> result = names.stream().filter(s->s.startsWith("O")).collect(Collectors.toList());
        System.out.println("Filter: "+result);

        //sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted: "+show);

        //print elements using forEach
        number.stream().map(x->x*x).forEach(y-> System.out.println(y));

        //reduce method
        int even=number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println("reduce: "+even);

        //distinct method
        System.out.println("distinct elements");
        number.stream().distinct().forEach(x-> System.out.println(x));

        long count=number.stream().distinct().count();
        System.out.println("no of distinct values: "+count);


    }
}
