
package Day3Problems;

public class Problem6 {

    void displayReverse(int[] arr) {
        System.out.println("Reverse array is :");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Problem6 p = new Problem6();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        p.displayReverse(arr);
    }
}
