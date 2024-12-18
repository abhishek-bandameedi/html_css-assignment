package regex;

import java.util.regex.*;

public class RegexExample1 {
    public static void main(String[] args) {
        //comparing strings

        boolean b= Pattern.compile(".a").matcher("aa").matches();
        System.out.println(b);

//        boolean b2=Pattern.matches(".a","aa");

        //character class

        System.out.println(Pattern.matches("[abc]","abcd"));
        System.out.println(Pattern.matches("[abc]","a"));

        //quantifiers
        System.out.println();

        System.out.println(Pattern.matches("[abc]?","a"));
        System.out.println(Pattern.matches("[abc]?","abc"));
        System.out.println();

        System.out.println(Pattern.matches("[abc]+","a"));
        System.out.println(Pattern.matches("[abc]+","abcd"));
        System.out.println();

        System.out.println(Pattern.matches("[abc]*","abcabcabc"));
        System.out.println();

        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","Abhi1"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","Abhi12"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","Abh1@"));
    }
}
