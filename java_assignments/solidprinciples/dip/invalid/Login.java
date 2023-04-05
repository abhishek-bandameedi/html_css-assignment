package solidprinciples.dip.invalid;

public class Login {
    private Email emailId;
    public Login(Email emailId){
        this.emailId=emailId;
    }
    public void loginToAccount(){
        emailId.signIn();
    }

    public static void main(String[] args) {
        Email emailId=new Email();
        Login login=new Login((emailId));
        login.loginToAccount();
    }
}
