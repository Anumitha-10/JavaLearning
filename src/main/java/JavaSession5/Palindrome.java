package JavaSession5;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(s.equals(rev));
    }
}
