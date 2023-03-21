package assignments.assignment7.problem5;

public class InnerClass {
    public static void main (String[] args) {
        OuterClassTwo.InnerClassTwo x=new OuterClassTwo().new InnerClassTwo("Jella");
    }
}
class OuterClassOne{
    OuterClassOne(){
        System.out.println("OuterClassOne constructor");
    }
    class InnerClassOne{
        InnerClassOne(String testString)
        {
            System.out.println("InnerClassOne non-default constructor parameter string : "+testString);
        }
    }
}
class OuterClassTwo{
    OuterClassTwo(){
        System.out.println("OuterClassTwo constructor");
    }
    class InnerClassTwo extends OuterClassOne.InnerClassOne{
        InnerClassTwo(String string)
        {
            new OuterClassOne().super(string);
            System.out.println("InnerClassTwo non-default constructor");
        }
    }
}