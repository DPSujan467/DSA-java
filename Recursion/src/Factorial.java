public class Factorial {

    static int FN(int n){
        // base case
        if(n==0) return 1;
        //smaller problem
        int smaller = FN(n-1);
        //big problem or self work
        int ans = n * smaller; // n * n-1
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(FN(6));
    }
}
