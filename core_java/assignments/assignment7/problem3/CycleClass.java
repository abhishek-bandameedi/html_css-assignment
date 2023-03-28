package assignments.assignment7.problem3;

class CycleClass extends Concrete implements Cycle3{
    @Override
    public void cycleMethod1() {
        System.out.println("cycleMethod1");
    }

    @Override
    public void cycleMethod2() {
        System.out.println("cycleMethod2");
    }

    @Override
    public void cycleMethod4() {
        System.out.println("cycleMethod4");
    }

    @Override
    public void cycleMethod3() {
        System.out.println("cycleMethod3");
    }

    @Override
    public void cycleMethod5() {
        System.out.println("cycleMethod5");
    }

    @Override
    public void cycleMethod6() {
        System.out.println("cycleMethod6");
    }

    @Override
    public void cycleMethod7() {
        System.out.println("cycleMethod7");
    }

    public void interfaceMethod(Cycle c){
        System.out.println("method");
    }
    public void interfaceMethod1(Cycle1 c){
        System.out.println("method1");
    }
    public void interfaceMethod2(Cycle2 c){
        System.out.println("method2");
    }
    public void interfaceMethod3(Cycle3 c){
        System.out.println("method3");
    }
}

