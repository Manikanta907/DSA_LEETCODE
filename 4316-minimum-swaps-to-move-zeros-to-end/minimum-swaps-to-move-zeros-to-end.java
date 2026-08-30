class Solution {
    public int minimumSwaps(int[] nums) {


        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
            }
        }
        int c = 0;
        for(int i=0;i<nums.length-count;i++){
            if(nums[i]==0){
                c++;

            }

        }

        return c;

        
    }
}