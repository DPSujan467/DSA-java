import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        System.out.println("Enter the size of an arry");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        for (int i=0;i<=n;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }

    }
}
