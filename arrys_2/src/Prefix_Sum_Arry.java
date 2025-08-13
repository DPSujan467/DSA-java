import java.util.Scanner;

public class Prefix_Sum_Arry {

    static void printarry(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+arr[i]+" ");
        }
    }
    static int[] prefix(int[] arr){
        int n= arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for (int i = 1; i <n ; i++) {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arry : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
      int[] pref = prefix(arr);
        printarry(pref);
    }
}
