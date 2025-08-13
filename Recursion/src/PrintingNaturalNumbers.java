import java.util.Scanner;

public class PrintingNaturalNumbers {

    static void PrintIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintIncreasing(n-1);
        System.out.println(n);
    }
    static void PrintDecresing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintDecresing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Increasing");
        PrintIncreasing(n);
        System.out.println("Decresing");
        PrintDecresing(n);

    }
}
