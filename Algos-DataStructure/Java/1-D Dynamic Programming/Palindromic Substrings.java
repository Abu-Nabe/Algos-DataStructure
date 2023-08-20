Palindromic Substrings

class Solution {

    public int countSubstrings(String s) {
        int result = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            
            // Expand around the current character for odd-length palindromes
            result += expandAroundCenter(s, i, i);
            
            // Expand around the current and next character for even-length palindromes
            result += expandAroundCenter(s, i, i + 1);
        }
        
        return result;
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        
        // Keep expanding while the characters match and the indices are within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        
        return count;
    }
}
