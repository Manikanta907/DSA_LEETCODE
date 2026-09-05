class Solution {
    public int lengthOfLastWord(String s) {

        String [] str = s.trim().split("\\s+");
        int n=str.length-1;
        String result = str[n];

        return result.length();

        
    }
}