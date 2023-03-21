package assignments.assignment6;

import java.util.*;
public class VampireNumber {
    public static void main(String[] args){
        vampireNumbers();
        OverloadedConstructor overloaded = new OverloadedConstructor();
        Constructors[] constructors = new Constructors[5];
        for(int i=0;i<5;i++){
            constructors[i]= new Constructors(Integer.toString(i+1));
        }

    }
    public static void vampireNumbers(){
        int count = 1;
        for(Long i = 10L; count<=100;i++){
            if(getNumberOfDigits(i)%2!=0){
                i= i*10;
                continue;
            }
            Long endFactorCheck = (long)Math.pow(10,(double)(getNumberOfDigits(i)/2));
            for(Long factor1 = (long)Math.pow(10,(double)((getNumberOfDigits(i)/2)-1)); factor1 < endFactorCheck;factor1++){
                if(i%factor1==0){
                    Long factor2 = i/factor1;
                    if(checkFactorCombination(factor1, factor2, i)){
                        System.out.println(count+". "+i+" ( "+factor1+" , "+factor2+" )");
                        count++;
                        break;
                    }
                }
            }
        }
    }

    public static boolean checkFactorCombination(Long factor1, Long factor2, Long number) {
        if(Long.toString(factor1).endsWith("0") && factor2%10L==0){
            return false;
        }
        else{
            char c[] = Long.toString(number).toCharArray();
            char d[] = (Long.toString(factor1)+Long.toString(factor2)).toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            return Arrays.equals(c,d);
        }
    }

    public static int getNumberOfDigits(Long number){
        return Long.toString(number).length();
    }

}