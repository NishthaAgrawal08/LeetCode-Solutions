class Solution {
    public int maxProduct(int[] arr) {
    int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                secondmax = max;
                max = arr[i];
            } 
            else if (arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }

        return (max - 1) * (secondmax - 1);
    }
}