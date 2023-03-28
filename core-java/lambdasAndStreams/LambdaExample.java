package lambdasAndStreams;

import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("one");
        names.add("two");
        names.add("three");

        names.forEach((name)->{System.out.println(name);});
    }
}
