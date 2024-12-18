package classesandobjects;

public class SampleClass {
    String name; //instance variable
    int accNo;  //instance variable


    public static void main(String[] args) {
        SampleClass p1=new SampleClass();
        p1.name="Abhishek";
        p1.accNo=12345;
        System.out.println(p1.name);
        System.out.println(p1.accNo);
    }
}
