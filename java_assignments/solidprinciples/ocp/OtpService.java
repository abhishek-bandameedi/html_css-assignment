package solidprinciples.ocp;

public class OtpService {
    public void sendOtp(String medium){
        if(medium.equals("email")){
            //send otp through email
        }
        if(medium.equals("mobile")){
            //send otp through sms
        }
    }
}
