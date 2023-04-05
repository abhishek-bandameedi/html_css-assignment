package assignments.assignment8;

class ExceptionA extends Exception{
    ExceptionA(String message){
        super(message);
    }
}
class ExceptionB extends Exception{
    ExceptionB(String message){
        super(message);
    }
}
class ExceptionNotAB extends Exception{
    ExceptionNotAB(String message){
        super(message);
    }
}
public class Assignment8 {
    public static void checkMethod(Character character) throws Exception{
        if (character == 'A') {
            throw new ExceptionA("Character A exception");
        }
        else if( character == 'B'){
            throw new ExceptionB("Character B exception");
        }
        else{
            throw new ExceptionNotAB("Character is neither A nor B exception");
        }
    }

    public static void main(String[] args) {
        try{
            checkMethod('C');
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally executed");
        }
    }
}
