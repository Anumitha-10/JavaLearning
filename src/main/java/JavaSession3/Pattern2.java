package JavaSession3;

public class Pattern2 {

        public static void main(String[] args) {
            int n = 4;

            for (int i = 1; i <= n; i++) {

                for (int sp= 1; sp <= n - i; sp++) {
                    System.out.print("  ");
                }

                for (int sr = 1; sr <= i; sr++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }

