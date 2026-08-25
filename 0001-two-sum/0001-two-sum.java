class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int[] arr=new int[2];
        while(l<nums.length){
            int r = l+1;
            while(r<nums.length){
                if(nums[l]+nums[r]==target){
                    return new int[]{l,r};
                }
                r++;
            }
            l++;
        }
        return arr;
    }
}