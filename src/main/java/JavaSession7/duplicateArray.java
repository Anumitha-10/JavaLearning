package JavaSession7;

public class duplicateArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        duplicateArray obj = new duplicateArray();

        int k = obj.removeDuplicates(nums);

        System.out.println("Unique Elements = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
