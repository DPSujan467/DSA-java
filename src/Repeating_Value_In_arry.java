import java.util.Scanner;

public class Repeating_Value_In_arry {

    public static int repeatingVal(int arr[]){
        int rep=0;
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                  return arr[i];
                }
            }
        }
        return -1;
    }
  public static int lastRepeatingValue(int arr[]){
      int n= arr.length;
      for (int i = n-1; i >=0; i--) {
          for (int j = 0; j < i; j++) {
              if (arr[i]==arr[j]){
                  return arr[i];
              }
          }
      }
      return -1;
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arry : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements :  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("First Repeating number is "+repeatingVal(arr));
        System.out.println("Last Repeating Value is "+lastRepeatingValue(arr));
    }
}
