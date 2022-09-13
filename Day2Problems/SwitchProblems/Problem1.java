// TO CHECK INPUT IS VOWEL OR CONSONANT

package Day2Problems.SwitchProblems;

import java.util.Scanner;

public class Problem1 {

    void vowelOrConsonant(String inp) {
        switch (inp) {
            case "a", "e", "i", "o", "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        Problem1 p = new Problem1();
        p.vowelOrConsonant(inp);
    }
}
