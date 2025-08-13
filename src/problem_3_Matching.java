public class problem_3_Matching {
    public static void main(String[] args) {
        int arr[]={10,20,30,55};
        int key=55;
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                ans=i;
            }else {
                System.out.println("not found ");
            }
        }
        System.out.println("the key " + key + "is matched at index "+ans);
    }
}
