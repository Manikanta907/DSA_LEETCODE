class Solution {
    public void moveZeroes(int[] num) {
        int i=0;
        int pos=0;
        while(i<num.length){
            if(num[i]!=0){
                num[pos]=num[i];
                pos++;
            }
            i++;

        
        }
        while(pos<num.length){
            num[pos]=0;
            pos++;
        }
        
        
    }
}