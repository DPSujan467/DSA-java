import java.util.Scanner;

public class lastOccurenceOfArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an arry : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of an arry : ");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int lastOccurence=0 ;
        System.out.print("Enter the number to find last Occurence of an arrys : ");
        int num = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                lastOccurence=i;
            }
        }
        if (lastOccurence>0) {
            System.out.println("The last occurence of " + num + " is occured at index number " + lastOccurence);
        }else
            System.out.println("The last occurence of " + num +" is not present in arry");

    }
}
