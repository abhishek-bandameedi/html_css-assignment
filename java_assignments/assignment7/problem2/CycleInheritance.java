package assignments.assignment7.problem2;

public class CycleInheritance {
    void balance() {
        System.out.println("This is cycle method");
    }
    public static void main(String[] args) {
        CycleInheritance[] cycle = new CycleInheritance[3];
        cycle[0] = new Unicycle();
        cycle[1] = new Bicycle();
        cycle[2] = new Tricycle();

        //upcasting the method
        cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();

        //downcasting the method
        ((Unicycle)cycle[0]).balance();
        ((Bicycle)cycle[1]).balance();
        ((Tricycle)cycle[2]).balance();
    }
}

