public class Main {

    private static void selectionSort(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println("Selection sort: ");
        for(int num: nums) {
            System.out.print(num + " -> ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {20, 10, 80, 30, 40, 5, 19, 1, 81};
        selectionSort(nums);
    }
}
