package JavaSession4;

public class CountVowels {

    public static void main(String[] args) {
        String s = "Welcome To Session";
        int vowelCount = 0;

        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}


