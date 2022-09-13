//Java Program to print the largest element in an array

package Day3Problems;

public class Problem8 {

    void duplicateElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Problem8 p = new Problem8();
        int arr[] = { 1, 2, 3, 5, 4, 3, 5, 6, 8 };
        p.duplicateElements(arr);
    }

}
