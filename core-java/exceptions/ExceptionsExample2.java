package exceptions;

import java.io.*;

public class ExceptionsExample2 {
    public static void m1() throws FileNotFoundException{
        FileReader file=new FileReader("/home/Abhishb/Documents/example1.txt");
        BufferedReader fileInput =new BufferedReader(file);
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            m1();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
