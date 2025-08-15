public class MergeSort {

    static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;   // 2 - 0 + 1 = 3
        int n2 = r - mid;      // 5 - 2 = 3

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) { //l → starting index of the left portion in arr
            left[i] = arr[l + i];     // i → loop counter
        }                            //n1 → number of elements in the left half (mid - l + 1)

        for (int j = 0; j < n2; j++) {       //mid + 1 → starting index of the right portion in arr
            right[j] = arr[mid + 1 + j];    //j → loop counter
        }                                  // n2 → number of elements in the right half (r - mid)

        int i = 0, j = 0, k = l; //i walks through left[] , j walks through right[] , k writes into the correct place in arr[] starting at l

        while (i < n1 && j < n2) {       //Compare the current element of left[] with the current element of right[].
            if (left[i] < right[j]) {   //Whichever is smaller gets placed in arr[k]
                arr[k++] = left[i++];  //Move that array’s pointer (i or j) forward.
            } else {                  //Always increment k because we just filled a slot in arr
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {                //If right[] is exhausted first, some elements might still be left in left[].
            arr[k++] = left[i++];      //Since left[] is already sorted, we can just copy them directly.
        }
        while (j < n2) {              //If left[] is exhausted first, we copy the remaining sorted elements from right[]
            arr[k++] = right[j++];
        }
    }

    static void mergesort(int[] arr, int l, int r) { // l is stating index and r is ending index
        if (l >= r) return;
        int mid = (l + r) / 2;  // finding mid point
        mergesort(arr, l, mid);   //Recursively sort the left half
        mergesort(arr, mid + 1, r); //Recursively sort the right half
        merge(arr, l, mid, r); //Merge the two sorted halves
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 3, 2};
        System.out.println("Before sorting:");
        printArr(arr);

        mergesort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        printArr(arr);
    }
}
