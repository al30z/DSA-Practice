//Time complexity: O(n), where n is the length of the original string.
//Space complexity: O(n)

class Solution {
    public boolean isPalindrome(String s) {      
        //there are two methods to solve- by reversing entire string and two pointer method 
        //first remove all punctuations and non alphanumeric chars , and convert it to all small case
        s= s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int  i = 0;
        int j = s.length() - 1; // arrays use .length as it is a property of arrays, strings use the method .length()
        
        while (i<=j) {
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}

