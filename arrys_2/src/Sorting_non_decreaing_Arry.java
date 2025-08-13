import java.util.Scanner;

public class Sorting_non_decreaing_Arry {

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] printarry(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
        return arr;
    }
    static int[] revese(int[] arr){
        int n = arr.length;
        int i=0;
        int j =n-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    static int[] Sortnondecri(int arr[]){
        int n= arr.length;
        int i =0;
        int j=n-1;
        int k=0;
        int ans[] = new int[n];
        while (i<=j){
            if (Math.abs(arr[i])>Math.abs(arr[j])){
                arr[k++]=arr[i]*arr[i];
                i++;
            }else {
                arr[k++] = arr[j] * arr[j];
                j--;
            }
        }
        revese(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of an arry : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+" elements" );
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original arry : ");
        printarry(arr);
        System.out.println("Sorted Arry");
        int[] sorted = Sortnondecri(arr);
        printarry(sorted);
    }
}
