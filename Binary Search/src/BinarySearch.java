public class BinarySearch {

    static boolean BS(int []arr,int target){
        int n=arr.length;
        int start = 0;
        int end = n-1;
       while (start<=end){
           int mid = (start+end)/2;
           if(target==arr[mid]){
               return true;
           } else if (target<arr[mid]) {
               end=mid-1;
           }else
               start=mid+1;
       }
        return false;
    }
    static boolean ReccursiveBS(int arr[],int start,int end,int targe){
        if(start>end) return false;
        int mid=(start+end)/2;
        if (targe==arr[mid]){
            return true;
        }else if(targe<arr[mid]){
            return ReccursiveBS(arr,start,mid-1,targe);
        }else
            return ReccursiveBS(arr,mid+1,end,targe);
    }
    public static void main(String[] args) {
        int arr[] = {1,12,23,34,55,86};
        int target=55;
        //System.out.println(BS(arr,target));
        System.out.println(ReccursiveBS(arr,0,arr.length-1,55));
    }
}
