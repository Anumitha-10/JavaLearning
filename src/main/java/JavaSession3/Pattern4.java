package JavaSession3;

public class Pattern4 {
        public static void main(String[] args) {
            int n = 4;

            for (int i = n; i >= 1; i--) {

                for (int space = 0; space < n - i; space++) {
                    System.out.print("  ");
                }

                for (int star = 1; star <= i; star++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }

