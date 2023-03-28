package assignments.assignment7.problem1;


public class RodentInheritance {
    public static void main(String[] args) {
        Rodent rodent[] = new Rodent[3];
        rodent[0]= new Mouse();
        rodent[1]= new Gerbil();
        rodent[2]= new Hamster();

        for(Rodent i : rodent){
            i.nameOfRat();
        }
    }
}
abstract class Rodent{
    Rodent(){
        System.out.println("Rodent Constructor");
    }
    public abstract void nameOfRat();
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("Mouse Constructor");
    }
    public void nameOfRat(){
        System.out.println("Mouse");
    }
    public void activity(){
        System.out.println("Mouse activity");
    }
}
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Gerbil Constructor");
    }
    public void nameOfRat(){
        System.out.println("Gerbil");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster Constructor");
    }
    public void nameOfRat(){
        System.out.println("Hamster");
    }
}