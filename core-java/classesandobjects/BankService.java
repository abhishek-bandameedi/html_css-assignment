package classesandobjects;

public class BankService {
    String name;
    int accNo;
    int depositAmount;
    int withdrawAmount;
    public void createAcc(String name,int accNo){
        this.name=name;
        this.accNo=accNo;
    }
    public void deposit(int depositAmount){
        System.out.println(" deposited $"+depositAmount+" into account");
    }
    public String getName(){return name;}
    public int getAccNo(){return accNo;}

    public static void main(String[] args) {
        BankService cust=new BankService();
        cust.createAcc("Abhishek",123);
        System.out.println(cust.getName());
        System.out.println(cust.getAccNo());
        cust.deposit(5000);
    }
}
