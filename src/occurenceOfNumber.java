import java.util.Scanner;

public class occurenceOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arry");
        int n = sc.nextInt();
        int arr[]=new int[n];
        int count = 0;
        System.out.println("Enter the elements of an arry");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to find occurence");
        int num =sc.nextInt();
        for (int i=0;i< arr.length;i++){
            if (arr[i]==num){
                count++;
            }
        }
        if(count>0){
            System.out.println(" the number "+num+" occured "+count+" times");
        }else
            System.out.println(" the number "+num+" is not present in arry");
    }
}
