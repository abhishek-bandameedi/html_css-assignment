package strings;

public class StringMethods {
    public static void main(String[] args) {
        String name="Abhishek";
        System.out.println(name);
        //length of the string
        int len=name.length();
        System.out.println(len);
        //change string to lowecase
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        //change string to uppercase
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        //trim method
        String old="    abhi   ";
        String newWord=old.trim();
        System.out.println(newWord);
        //accessing substrings
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));
        //replace characters
        System.out.println(name.replace('b','c'));
        //starts with returns boolean
        System.out.println(name.startsWith("Ab"));
        System.out.println(name.endsWith("k"));
        //find character at specific index
        System.out.println(name.charAt(2));
        //find index of a character
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("h",4));
        System.out.println(name.lastIndexOf("h"));
        //equals
        System.out.println(name.equals("Abhishek"));
        System.out.println(name.equalsIgnoreCase("abhishek"));






    }
}
