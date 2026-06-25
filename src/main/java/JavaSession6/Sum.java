package JavaSession6;

public class Sum {

    public static void main(String[] args) {
        int[] n = {-1, 0, 1, 2, -1, -4};

        for (int i = 0; i < n.length - 2; i++) {

            for (int j = i + 1; j < n.length - 1; j++) {

                for (int k = j + 1; k < n.length; k++) {

                    if (n[i] + n[j] + n[k] == 0) {
                        System.out.println(n[i] + " " + n[j] + " " + n[k]);
                    }

                }

            }

        }

    }

}
