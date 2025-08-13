public class arry_references {

//    public static void printArry(int arr[]){
//        for(int i =0;i<= arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
    public static void main(String[] args) {
        int[] arr=new int[4];
        arr[0]=16;
        arr[1]=06;
        arr[2]=04;



        System.out.println("Printing original arry ");
        for(int i =0;i<= arr.length;i++){
            System.out.println(arr[i]);
        }

        int[] arr_2 = arr;
        for(int i =0;i<= arr.length;i++){
            System.out.println(arr_2[i]);
        }
    }
}
