package JavaSession6;
import java.util.*;
public class ValidOccurences {

        public static void main(String[] args) {
            String s = "()";
            Stack<Character> st = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(')
                    st.push(c);
                else if (c == ')' && !st.isEmpty())
                    st.pop();
                else {
                    System.out.println(false);
                    return;
                }
            }

            System.out.println(st.isEmpty());
        }
    }

