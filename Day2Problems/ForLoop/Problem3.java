package Day2Problems.ForLoop;

import java.util.Scanner;

public class Problem3 {
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
        System.out.println("Enter input to check its palindrome : ");
        int input = sc.nextInt();
        Problem3 p2 = new Problem3();
        String Output = p2.reverseNumber(input);
        int Out = Integer.parseInt(Output);
        if (Out == input) {
            System.out.println("It is a palindrome!!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
