class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet <Integer> set = new TreeSet<>();
        for(int i : nums){
            set.add(i);
        }
        int i=0;
        for(int it:set){
            nums[i++]=it;

        }
        return set.size();
        
    }
}