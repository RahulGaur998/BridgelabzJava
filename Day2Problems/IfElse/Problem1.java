package Day2Problems.IfElse;

import java.util.Scanner;

public class Problem1 {

    void numberToWord(String input) {
        if (input.charAt(0) == '0') {
            System.out.println("Zero");
        } else if (input.charAt(0) == '1') {
            System.out.println("One");
        } else if (input.charAt(0) == '2') {
            System.out.println("Two");
        } else if (input.charAt(0) == '3') {
            System.out.println("Three");
        } else if (input.charAt(0) == '4') {
            System.out.println("Four");
        } else if (input.charAt(0) == '5') {
            System.out.println("Five");
        } else if (input.charAt(0) == '6') {
            System.out.println("Six");
        } else if (input.charAt(0) == '7') {
            System.out.println("Seven");
        } else if (input.charAt(0) == '8') {
            System.out.println("Eight");
        } else if (input.charAt(0) == '9') {
            System.out.println("Nine");
        } else {
            System.out.println("Enter value between 0-9");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a value between 0-9 :");
        String input = sc.next();
        Problem1 p = new Problem1();
        p.numberToWord(input);
    }

}
