class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        if(address == null){
            return "";
        }

        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }//end for loop

        return sb.toString();
    }
}