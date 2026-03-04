package JavaSession4;

public class Palindrome {
    public static void main(String[] args) {

        String a = "Madam";
        a = a.toLowerCase();

        int start = 0;
        int end = a.length() - 1;
        boolean palindrome = true;

        while (start < end) {
            if (a.charAt(start) != a.charAt(end)) {
                palindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is palindrome: " + palindrome);
    }
}