package assignments.assignment5.main;

import assignments.assignment5.data.Data;
import assignments.assignment5.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.globalPrint();
        data.localPrint();

        Singleton singleton = Singleton.initializingString("Abhi");
        singleton.printString();

    }
}