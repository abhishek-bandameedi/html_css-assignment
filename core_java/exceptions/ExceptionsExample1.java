package exceptions;

public class ExceptionsExample1 {

    public static void createAccount(double balance){
        if(balance<500){
            throw new ArithmeticException("Minimum balance of 500 is necessary");
        }
        else{
            System.out.println("Minimum balance is maintained");
        }
    }
    public static void main(String[] args) {
        createAccount(200);

    }
}
