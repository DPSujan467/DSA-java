public class BubbleSort {
    static void swap(int[]arry,int a,int b){
        int temp = arry[a];
        arry[a]=arry[b];
        arry[b]=temp;
    }
    static void bubble(int[] arry){
        int n = arry.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {  // n-1 is also works 
                if(arry[j]<arry[j+1]){
                    swap(arry,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arry={7 , 6 ,3 , 5 , 4};
        bubble(arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.print((arry[i]+ " "));
        }
    }
}
