package exceptions;

public class SimpleException {
    public static void main(String[] args) {
        try {
            try {
                //This contains the code that may raise the exception
                int res = 100 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int arr[] = new int[5];
                arr[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("Handled the exception");
        }
        finally {
            System.out.println("finally block will be executed regardless of try and catch block");
        }
    }
}
