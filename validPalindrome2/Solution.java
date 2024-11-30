class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.validPalindrome("aba");

    }

    
    //ababa

    public boolean validPalindrome(String s) {
        
        int index =0;
        boolean isValid = false;

        for(int i =0; i < s.length()-1; i++){

            String newString = "";
            StringBuilder newnewString = new StringBuilder(s);
            newnewString.deleteCharAt(index);

            newString = newnewString.toString();

            System.out.println(newString);

         


            if(isPalindrome(newString)){

                isValid = true;
                break;
            }
            else{
                isValid = false;
            }
            newString="";
        }     
        return isValid;
    }

    public boolean isPalindrome(String s){

//abc
//bc
//cb
        String reversed = "";
        for(int i = s.length()-1; i >= 0; i--){
            reversed = reversed + s.charAt(i);
        }
        
        
        return s.equals(reversed);
        

    }


}



