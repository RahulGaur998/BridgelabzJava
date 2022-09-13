//Write a program to check two strings are equal or not. 

package Day1Problems;

public class Problem3 {
    public static void main(String[] args) {

        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;
        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));
        System.out.println(str.equals(objStr));
    }
}
