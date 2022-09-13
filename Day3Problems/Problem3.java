//Java Program to print the largest element in an array

package Day3Problems;

public class Problem3 {

    int Greatest(int arr[]) {
        int greatest = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > greatest) {
                    greatest = arr[i];
                } else if (greatest < arr[j]) {
                    greatest = arr[j];
                }
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        Problem3 p = new Problem3();
        int arr[] = { 1, 2, 3, 5, 4, 3, 5, 6, 8 };
        int greatest = p.Greatest(arr);
        System.out.println("Greatest element of array is : " + greatest);
    }

}
