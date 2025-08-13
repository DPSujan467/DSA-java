

import java.util.Scanner;

public class triplet_Sum {
    static int tripletSum(int arr[],int target){
        int sum = 0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for(int j = i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                     sum++;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an arry : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Elements of an arrys : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum : ");
        int target = sc.nextInt();
        System.out.println(tripletSum(arr,target));
    }
}
