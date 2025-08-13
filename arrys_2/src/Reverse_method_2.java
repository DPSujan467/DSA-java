import java.util.Scanner;

public class Reverse_method_2 {

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr){
        int n = arr.length;
        int i =0;
        int j =n-1;
        while (i<j){
                swap(arr,i,j);
                i++;
                j--;
        }
    }
      static int[] printarry(int[]arr){
          for (int i = 0; i < arr.length; i++) {
              System.out.print(" "+arr[i]+" ");
          }
          return arr;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arry : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        printarry(arr);
    }
}