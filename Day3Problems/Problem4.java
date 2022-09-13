//Java Program to print the Smallest element in an array

package Day3Problems;

public class Problem4 {

    int Smallest(int arr[]) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                } else if (smallest > arr[j]) {
                    smallest = arr[j];
                }
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Problem4 p = new Problem4();
        int arr[] = { 1, 2, 3, 5, 4, 3, 5, 6, 8 };
        int smallest = p.Smallest(arr);
        System.out.println("Greatest element of array is : " + smallest);
    }

}
