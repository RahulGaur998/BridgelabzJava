//Write a program to demonstrate static variables, methods, and blocks.

package Day1Problems;

public class Problem6 {
    static int inc = 2;
    int limit;

    Problem6() {
        limit = 5;
    }

    int inc_value(int res) {
        res = res + inc;
        return res;
    }

    public static void main(String[] args) {
        int end_res = 0;
        Problem6 p = new Problem6();
        for (int i = 0; i < p.limit; i++) {
            end_res = p.inc_value(end_res);
        }
        System.out.println("End result is : " + end_res);
    }
}
