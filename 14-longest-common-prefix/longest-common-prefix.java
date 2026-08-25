class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String strleft  = strs[0];
        String strright = strs[strs.length-1];

        int index = 0;
        int  max = Math.min(strleft.length(),strright.length());

        while(index<max){
            if(strleft.charAt(index) == strright.charAt(index)){
                index++;
            }
            else{
                break;
            }

            
        }
        return strleft.substring(0,index);
     } 
   
}