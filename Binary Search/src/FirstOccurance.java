public class FirstOccurance {
    static int FO(int[] arr,int target){
        int n=arr.length;
        int start=0,end=n-1;
        int index=-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                index=mid;
                end=mid-1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else
                start=mid+1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,44,44,48,55,66,88,};
        int target=44;
        System.out.println(FO(arr,44));
    }
}
