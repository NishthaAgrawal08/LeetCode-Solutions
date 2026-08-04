class Solution {
    public boolean validPalindrome(String s) {
        char ch[] = s.toCharArray();
    int left = 0;
    int right = ch.length - 1;

    while (left < right) {

        if (ch[left] != ch[right]) {
            return check(ch, left + 1, right) ||
                   check(ch, left, right - 1);
        }

        left++;
        right--;
    }

    return true;
}

public boolean check(char ch[], int left, int right) {

    while (left < right) {
        if (ch[left] != ch[right]) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}
}
    
