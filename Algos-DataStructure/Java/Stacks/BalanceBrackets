public static String isBalanced(String s) {
    // Write your code here
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                     return "NO";
                }
    
                char top = stack.peek();
                if(c == ')' && top == '(' 
                || c == ']' && top == '[' || c == '}' && top == '{') {
                    stack.pop();
                }else{
                    return "NO";
                }
            }
            }
            return stack.isEmpty() ? "YES" : "NO";
    }
