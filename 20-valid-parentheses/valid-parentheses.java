class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char [] charArr = s.toCharArray();

        for(int i=0;i<=charArr.length-1;i++){
             if(charArr[i] == '(' || charArr[i] == '{' || charArr[i]=='['){
                stack.push(charArr[i]);
             }
             else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if(charArr[i]==']'&& top!='['){
                    return false;
                }
                if(charArr[i]==')'&& top!='('){
                    return false;
                }
                if(charArr[i]=='}'&& top!='{'){
                    return false;
                }
             }
             
        }return stack.isEmpty();
        
    }
}