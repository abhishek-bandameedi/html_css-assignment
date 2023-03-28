package arrays;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        //array of arrays
        int [][] matrix;
        matrix=new int[2][2];
        matrix[0][0]='a';
        matrix[0][1]='b';
        matrix[1][0]='c';
        matrix[1][1]='d';
        //displaying the array
        System.out.println("displaying the multidimentional array");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
