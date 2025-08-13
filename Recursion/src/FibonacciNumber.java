public class FibonacciNumber {

    static int FN(int n){
        if (n == 0 || n == 1)
            return n;
       int prev = FN(n-1);
       int PrevPrev = FN(n-2);
       return prev+PrevPrev;
    }

    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(FN(i));
        }
    }
}
