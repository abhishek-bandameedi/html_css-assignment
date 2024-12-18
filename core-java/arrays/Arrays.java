package arrays;

public class Arrays {
    public static void main(String[] args) {
//        int [] ages; //declaration
//        ages=new int[3];  //memory allocation

//        int[] ages={21,22,22,21}; //declaration + initializing elements

        int [] ages=new int[3];  //declaration +memory allocation
        ages[0]=21;
        ages[1]=22;
        ages[2]=22;
//        ages[3]=21; //gives index out of bound error
        System.out.println(ages[1]);

        System.out.println(ages.length);//to get length of the array

        //Displaying the array(using for loop)
        System.out.println("Displaying the array(using for loop): ");
        for(int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
        }

        //displaying ages array using for each loop
        System.out.println("displaying ages array using for each loop: ");
        for(int item:ages){
            System.out.println(item);
        }


    }
}
