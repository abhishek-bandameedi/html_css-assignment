package assignments.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(Pattern.matches("[A-Z]+[a-zA-Z,'.\\s]*[.]",input)){
            System.out.println("Sentence matching regex pattern");
        }else{
            System.out.println("Not matching pattern");
        }
    }
}
