package assignments.assignment7.problem3;

class InterfaceInheritance{
    public static void main(String[] args) {
        CycleClass cycle = new CycleClass();

        cycle.interfaceMethod(cycle);
        cycle.interfaceMethod1(cycle);
        cycle.interfaceMethod2(cycle);
        cycle.interfaceMethod3(cycle);
    }
}
