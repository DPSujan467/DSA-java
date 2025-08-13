import java.util.Scanner;

public class arrSorted_OR_not {

    public static boolean issorted(int arr[]){
        boolean check = true;
        for (int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an arry :");
        int n = sc.nextInt();
        boolean check = true;
        int arr[] = new int[n];
        System.out.print("Enter the Elements of on arry :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("is Sorted "+issorted(arr));
    }
}
