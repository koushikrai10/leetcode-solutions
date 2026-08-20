class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        for(int i=0;i<s.length();i++)
        {
            char leftchar=s.charAt(left);
            char rightchar=s.charAt(right);

            if(!Character.isLetterOrDigit(leftchar))
            {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightchar))
            {
                right--;
                continue;
            }

            leftchar=Character.toLowerCase(leftchar);
            rightchar=Character.toLowerCase(rightchar);

            if(leftchar!=rightchar)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}