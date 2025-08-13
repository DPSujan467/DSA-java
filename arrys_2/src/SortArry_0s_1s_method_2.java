import java.util.Scanner;

public class SortArry_0s_1s_method_2 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printarry(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }

    static int[] Sortarry(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }

            if (arr[i] == 0) {
                arr[i]++;
            }
            if (arr[j]==1){
                arr[j]--;
            }
        }
        return arr;
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
        System.out.println("Original arry");
        printarry(arr);
        System.out.println("sorted aryy");
        Sortarry(arr);
        printarry(arr);

    }
}
