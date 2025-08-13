public class quickSort {

    static void printArry(int[] arr){
        for (int a:arr)
            System.out.print(a + " ");
        System.out.println();
    }
    static void swap(int[] arr,int x,int y){
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr, int start, int end){

        int pivot = arr[start];                  //chosen the first element in the current subarray
        int count=0;                            //Counts how many numbers are less than or equal to pivot.
        for (int i = start+1; i <= end; i++) { //This tells us exactly where the pivot should be in sorted order.
            if(arr[i]<=pivot) count++;
        }
        int pivotIndex = start + count; //The pivot will be at position start + count in the sorted array. eg:start = 0,count = 4 → pivotIndex = 4
        swap(arr,start,pivotIndex);    //Swaps pivot from the start position to its calculated pivotIndex.
        int i = start , j = end;      //starts from start (left side) , j starts from end (right side).

        while(i < pivotIndex && j > pivotIndex){
            while (arr[i]<=pivot) i++; // i moves forward skipping elements already ≤ pivot.
            while(arr[j]>pivot)j--;   //  j moves backward skipping elements already > pivot.
            if(i<pivotIndex && j > pivotIndex){  //If both pointers find misplaced elements:
                swap(arr,i,j);                  //Swap them so that smaller elements go to left, larger ones go to right.
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void quicksort(int[] arr,int start , int end){
        if(start > end) return;                  //Stops recursion when the subarray is empty or has one element.
        int pi = partition(arr,start,end);      //Finds the correct position (pi) of the pivot in the current subarray.
        quicksort(arr,start,pi-1);        //After partition:   All elements left of pi are ≤ pivot.
        quicksort(arr,pi+1,end);        //All elements right of pi are > pivot.
    }                                       //The pivot itself is in final sorted position.
    public static void main(String[] args) {
        int arr[] = {8,4,5,6,2,9};
        int n = arr.length;
        System.out.print("Before sorting");
        printArry(arr);
        System.out.println("After Sorting");
        quicksort(arr,0,n-1);
        printArry(arr);
    }
}
