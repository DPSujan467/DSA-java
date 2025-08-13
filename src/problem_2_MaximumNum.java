public class problem_2_MaximumNum {
    public static void main(String[] args) {
        int arr[]={1,5,3,10,15,16};
        int max=0;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
