package assignments.assignment7.problem4;

public class CycleInterface extends CycleA {
    @Override
    public CycleI getCycle(String type) {
        if (type.equals("UniCycle")) {
            return new UniCycle();
        }
        if (type.equals("BiCycle")) {
            return new BiCycle();
        }
        if (type.equals("TriCycle")) {
            return new TriCycle();
        }
        return null;
    }

    public static void main(String[] args) {
        CycleA cycle = new CycleInterface();

        CycleI unicycle = cycle.getCycle("UniCycle");
        unicycle.type();

        CycleI bicycle = cycle.getCycle("BiCycle");
        bicycle.type();

        CycleI tricycle = cycle.getCycle("TriCycle");
        tricycle.type();

    }
}