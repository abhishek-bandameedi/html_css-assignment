package assignments.assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int noOfInput = scanner.nextInt();
        SimpleDateFormat formatter = new SimpleDateFormat ("dd-MM-yyyy");
        while(noOfInput-->0){
//            Scanner scanner1 = new Scanner(System.in);
            Date signUpDate = formatter.parse(scanner.next());
            Date currentDate = formatter.parse(scanner.next());
            System.out.println(getKYCDate(signUpDate,currentDate));
//            scanner1.close();
        }
    }
    public static String getKYCDate(Date signUpDate, Date currentDate){
        SimpleDateFormat formatter = new SimpleDateFormat ("dd-MM-yyyy");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(signUpDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(currentDate);
        Date startRange = signUpDate;
        if(signUpDate.getYear()==currentDate.getYear()){
            return "No Range";
        }
        else{
            calendar1.set(Calendar.YEAR,calendar2.get(Calendar.YEAR));
            calendar1.add(Calendar.DATE,-30);
            signUpDate = calendar1.getTime();
            calendar1.add(Calendar.DATE,60);
            if(calendar1.after(calendar2)){
                currentDate = calendar2.getTime();
            }
            else{
                currentDate = calendar1.getTime();
            }

        }

        return formatter.format(signUpDate)+" "+formatter.format(currentDate);
    }
}