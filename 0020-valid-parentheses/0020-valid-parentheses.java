class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty()){
            if(s.charAt(i)==')'&&st.peek()=='(')
            st.pop();
            else if(s.charAt(i)=='}'&&st.peek()=='{')
            st.pop();
            else if(s.charAt(i)==']'&&st.peek()=='[')
            st.pop();
            else
            st.push(s.charAt(i));
            }
            else{
                st.push(s.charAt(i));
            }
            
        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
}