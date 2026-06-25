package JavaSession6;

public class SortedArray {

    public static void main(String[] args) {

        int[] n = {1, 3, 5, 6};
        int target = 2;

        int i = 0;
        while (i < n.length && n[i] < target) {
            i++;
        }

        System.out.println(i);
    }

}
