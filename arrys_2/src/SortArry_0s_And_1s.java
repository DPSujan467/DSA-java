import java.util.Scanner;

public class SortArry_0s_And_1s {

    static void swap(int[]arr , int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void printarry(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }

    static void sortarr(int[]arr){
        int zeros=0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                zeros++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i<zeros){
                arr[i]=0;
            }else
                arr[i]=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arry : " );
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements :  ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("original arry");
        printarry(arr);
        System.out.println("Sorted arry");
        sortarr(arr);
        printarry(arr);
    }

}
