public class selectionSort {
    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void SelectionSort(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1 ;i++) {
            int min_index=i; //storing 0th index in min_index and assuming it is small value
            for (int j = i+1; j < n; j++) { // j is starting from i+1 index means 1st index
                if (arr[j]<arr[min_index]){  // comparing array values with min_index
                    min_index=j; // after comparing storing the smallest value index in min_index
                }
            }
            swap(arr,min_index,i); //swapping the values , 'i' the current smallest value
//            int temp=arr[i];
//            arr[i]=arr[min_index];
//            arr[min_index]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={5,3,2,1,4,6,0,};
       SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
