public class RotatedSortedTargetFind {

    static int TargetFing(int[] arr,int target) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid]==target){
                return mid;
            }

            if (arr[mid] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else if (target >= arr[start] && target < arr[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] arr= {4,5,6,7,1,2,3};
        int target = 3;
        System.out.println(TargetFing(arr,target));

    }
}
