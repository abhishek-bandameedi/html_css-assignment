package basics.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int age=21;
        if(age>=18){
            System.out.println("eligible to vote");
        }
        else {
            System.out.println("not eligible to vote");
        }
        if (age==18) {
            System.out.println("now you can apply for voterId");
        }
    }
}
