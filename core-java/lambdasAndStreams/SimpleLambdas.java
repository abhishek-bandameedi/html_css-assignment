package lambdasAndStreams;

public class SimpleLambdas {
    interface Greeting{
        public String greet(String s);
    }
    public void testGreeting(String a,Greeting g){
        String res=g.greet(a);
        System.out.println("Result: "+res);
    }

    public static void main(String[] args) {
        //(input)->body
        new SimpleLambdas().testGreeting("abhi",(String s)->"Hello, "+s);

        new SimpleLambdas().testGreeting("",
                (String e)->!e.isEmpty()?"hello, "+e:"you haven't entered the name");
    }
}
