import java.util.Scanner;

public class Unique_Number_in_arry {

    public static int uniqueNumber(int arr[]){
        int n=arr.length;
        int sum=-1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]!=-1){
                sum = arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an arry : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements of an arrys : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique number is : "+uniqueNumber(arr));
    }
}