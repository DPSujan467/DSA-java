public class InsertionSort {
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void Insertion(int[] arr){
        int n= arr.length;
        for (int i = 1; i <n ; i++) {
            int j=i;
            while (j > 0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,4,7,1};
        Insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        }
    }

