import java.util.Scanner;

class smallestAndLargestInArray {

    public static int[] findSmallestAndLargest(int arr[]) {
        if (arr.length == 0) {
            return new int[] {}; // Return empty array if input is empty
        }

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return new int[] {smallest, largest}; // Return array with smallest & largest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Handle invalid array size
        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        // Get array elements
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Find smallest and largest
        int[] result = findSmallestAndLargest(arr);

        // Print the new array
        System.out.println("New array containing smallest and largest: [" + result[0] + ", " + result[1] + "]");

        sc.close(); // Close Scanner
    }
}
