import java.util.Scanner;

public class Rotate_An_Arry {

    static int[] Rotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        int j = 0;
        int ans[]=new int[n];
        for (int i = n-k; i <n ; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i <n-k ; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void Printarr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arry : ");
        int n = sc.nextByte();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k : ");
        int k = sc.nextInt();
        Printarr(Rotate(arr,k));
    }
}
