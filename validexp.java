class Solution {
    public static int checkRedundancy(String s) {
        Stack<Character> stack =  new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='('){
                stack.push(ch);
            }
            if(ch==')'){
                if(stack.isEmpty()||stack.peek()=='('){
                    return 1;
                }
                else{
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
        }
        return 0;
    }
}
