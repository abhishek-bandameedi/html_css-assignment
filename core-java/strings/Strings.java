package strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        String name=new String("Abhi");
        String name="Abhishek";
        System.out.print("The name is: ");
        System.out.print(name);
        System.out.println();

        //using format specifiers

        String college="Sreenidhi";
        System.out.printf("I studied in %s college",college);
        System.out.println();
        System.out.printf("%20s",college);
        System.out.println();

        //Taking inputs of String
        String s1=sc.next();
        String s2=sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);


    }
}
