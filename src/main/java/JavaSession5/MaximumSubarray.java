package JavaSession5;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = num[0];
        int curSum = num[0];

        for (int i = 1; i < num.length; i++) {
            curSum = Math.max(num[i], curSum + num[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        System.out.println(maxSum);
    }
}
