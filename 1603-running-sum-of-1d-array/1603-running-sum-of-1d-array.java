class Solution {
    public int[] runningSum(int[] nums) {
        int out[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<=i;j++){
                temp+=nums[j];
            }
            out[i]=temp;
        }
        return out;
        
        
    }
}