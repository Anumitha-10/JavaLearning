package JavaSession3;
public class Sum {
        public static void main(String[] args) {
            int[] arr = {65, 30, 15, 25};

            int s = 0;

            for (int i = 0; i < arr.length; i++) {
                s += arr[i];
            }

            System.out.println("Sum: " + s);
        }
    }

