class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char bracket: s.toCharArray()){
            if(bracket=='(' || bracket== '{' || bracket== '['){
                st.push(bracket);
            }
            else if(bracket==')' || bracket=='}' || bracket==']' ){
                if(st.isEmpty()) return false;
                char top= st.peek();
                if((bracket==')' && top!='(' ) || 
                (bracket=='}' && top!='{') || 
                (bracket==']' && top!='[')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}