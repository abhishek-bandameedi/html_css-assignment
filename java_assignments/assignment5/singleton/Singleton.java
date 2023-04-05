package assignments.assignment5.singleton;

public class Singleton {
    String s;

    public static Singleton initializingString(String input){
        Singleton singleton = new Singleton(input);
        return singleton;
    }

    public void printString(){
        System.out.println(s);
    }

    public Singleton(String input){
        this.s = input;
    }
}
