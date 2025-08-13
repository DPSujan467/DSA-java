import java.util.Scanner;

public class Input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of an arry : ");
//  int n = sc.nextInt();
        System.out.println("Enter the number of rows : ");
        int n=sc.nextInt();
        System.out.println("Enter the number of coloms");
        int c = sc.nextInt();
        int [][]arry = new int[n][c];
        for (int i = 0; i <arry.length ; i++) {
            for (int j = 0; j < arry[i].length; j++) {
               arry[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                System.out.print(arry[i][j]);
            }
            System.out.println(" ");
        }

    }
}
