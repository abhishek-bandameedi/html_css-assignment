package basics.operators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String id=s.next();
        String pswd=s.next();

        String userId="abhishek1";
        String password="Abhi123";
        if(id==userId && pswd==password){
            System.out.println("login successful");
        }
        if(id!=userId || pswd!=password){
            System.out.println("Enter correct credentials");
        }

    }
}
