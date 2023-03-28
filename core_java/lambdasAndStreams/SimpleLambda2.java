package lambdasAndStreams;

public class SimpleLambda2 {
    interface pays{
        void pay(int amount);
    }

    public static void main(String[] args) {
        pays obj=(amount)->{System.out.println("payment done of $"+amount);};
        obj.pay(5000);
    }

}
