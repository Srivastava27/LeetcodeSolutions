class Solution {
    public boolean rotateString(String str, String goal) {
        if(str==null || goal==null || str.length()!=goal.length()){
            return false;
        }
        if(str.equals(goal)){
            return true;
        }
        
        StringBuffer sb=new StringBuffer(str);
        for(char c:str.toCharArray()){
            sb.deleteCharAt(0);
            sb.append(c);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}