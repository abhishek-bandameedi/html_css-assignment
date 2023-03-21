package solidprinciples.dip.valid;

public class Login {
    private Id id;
    public Login(Id id){
        this.id=id;
    }
    public void loginToAccount(){
        Id.signIn();
    }

    public static void main(String[] args) {
        Id id=new Email();
        Login login=new Login((id));
        login.loginToAccount();
    }
}
