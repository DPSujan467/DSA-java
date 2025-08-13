import java.util.Scanner;

public class maxNumberInArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of An Arry : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if (num < arr[i]){
                num=arr[i];
            }
        }
        System.out.println(num);
    }
}
