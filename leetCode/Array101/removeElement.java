class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int n = nums.length -1;
        for(int i = 0; i <=n; i++){
            if(nums[i] != val)
            {
                nums[j]= nums[i];
                j++;
            }
           
        }        
        return j;
    }
}
