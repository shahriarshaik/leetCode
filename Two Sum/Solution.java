class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target){
                    int[] returnArr = new int[2];
                    returnArr[0] = i;
                    returnArr[1] = j;
                    return returnArr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int[] out = twoSum(input, 9);
        for (int i : out) {
            System.out.print(i + " " );
        }

        System.out.println();
        int[] input1 = {3,2,4};
        out = twoSum(input1, 6);

        for (int i : out) {
            System.out.print(i + " " );
        }


    }

}