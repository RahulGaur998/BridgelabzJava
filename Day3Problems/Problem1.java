
package Day3Problems;

public class Problem1 {

    void display(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        p.display(arr);
    }
}
