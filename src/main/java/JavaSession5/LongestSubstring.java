package JavaSession5;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            String sub = "";

            for (int j = i; j < s.length(); j++) {
                if (sub.contains(String.valueOf(s.charAt(j))))
                    break;

                sub += s.charAt(j);
                max = Math.max(max, sub.length());
            }
        }

        System.out.println(max);
    }
}
