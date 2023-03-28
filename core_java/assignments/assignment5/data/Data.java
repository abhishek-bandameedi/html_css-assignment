package assignments.assignment5.data;

public class Data {
    int a;
    char ch;

    public void globalPrint(){
        System.out.println(a+" "+ch);
    }

    public void localPrint(){
        int a;
        char ch;
//        Printing local variables without initialising causes errors
//        System.out.println(a+" "+ch);

       /* method variables are instantiated by simply adding a number to stack pointer(where stacks take static memory allocation so we have to initialize local variables)
        But for class variables they are put into memory on heap(which is dynamically allocated) */

        System.out.println("Error printing local variables");
    }
}
