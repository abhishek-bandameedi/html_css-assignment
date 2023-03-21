package assignments.assignment2;
import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(checkString(input.toLowerCase()));
    }

    public static String checkString(String input){
        int count = 0;
        HashSet<Character> s1 = new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                s1.add(input.charAt(i));
            }
        }
        if(s1.size()==26){
            return "Input string contains all alphabets";
        }
        else{
            return " Input string doesn't contain all alphabets";
        }
    }
}
