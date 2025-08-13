import java.util.Scanner;

public class Frequency_query {
    static int[] makeFrequrency(int[]arr){
        int n=arr.length;
        int[] frequency=new int[n];
        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }
              return frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arry : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + "Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            int[] freq = makeFrequrency(arr);
        System.out.println("Enter Number of query");
            int q = sc.nextInt();

        while (q>0){
            System.out.println("Enter the number to search : ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }

    }
}
