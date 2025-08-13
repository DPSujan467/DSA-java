import java.util.Scanner;

public class Second_MaxValue_in_arry {

    public static int Maxvalue(int arr[]){   // fuction for getting maximum value in arry
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int secondmax(int arr[]){   //function for 2nd max in arry
        int mx =Maxvalue(arr);   //assigining maximum value to mx
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==mx){            //comparing arrys value with max value in arry
                arr[i]=Integer.MIN_VALUE;      // first max value will be change to -infinity
            }
        }
        int secmax=Maxvalue(arr);    //searching for 2nd max value in arry
        return secmax;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an arry : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements of an arrys : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondmax(arr));
    }
}
