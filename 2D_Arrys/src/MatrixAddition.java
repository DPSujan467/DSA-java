import java.util.Scanner;

public class MatrixAddition {
    static int[][] printArry(int[][] arry){
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                System.out.print(" "+arry[i][j]+" ");
            }
            System.out.print("\n");
        }
        return arry;
    }

    static void AdditionOfArrys(int[][]m1,int r1,int c1,int[][]m2,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Addition is not possible ");
        }
        int [][]sum=new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        printArry(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and column");
        int r1 = sc.nextInt();
        int c1=sc.nextInt();
        int[][] m1= new int[r1][c1];
        System.out.println("Enter the Matrix 1 Values : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j <c1; j++) {
                m1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the number of row and column");
        int r2= sc.nextInt();
        int c2 = sc.nextInt();
        int[][] m2 = new int[r2][c2];
        System.out.println("Enter the Matrix 2 Values : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printArry(m1);
        System.out.println("Matrix 2");
        printArry(m2);
        System.out.println("Addition of Arry is ");
        AdditionOfArrys(m1,r1,c1,m2,r2,c2);
    }
}
