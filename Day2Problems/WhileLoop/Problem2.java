//Write a Program to reverse the integer number eg. Input n=231 reverse is 132

package Day2Problems.WhileLoop;

import java.util.Scanner;

public class Problem2 {
    String output = "";

    String reverseNumber(int input) {
        while (input > 0) {
            output = output + ' ' + input % 10;
            input = input / 10;
        }
        output = output.replaceAll("\\s", "");
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input to give its reverse : ");
        int input = sc.nextInt();
        Problem2 p2 = new Problem2();
        String Output = p2.reverseNumber(input);
        System.out.println("Reverse of the given input is : " + Output);
    }
}
