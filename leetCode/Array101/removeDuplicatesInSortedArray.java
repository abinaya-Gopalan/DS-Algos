class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length-1;
        while(j<=n){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
              //  i++;
            }
            if(j<=n)
                j+=1;
            
            
        }
        return (i+1);
    }
}
