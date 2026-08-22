class Solution {
    public int thirdMax(int[] arr) {

        long max = Long.MIN_VALUE;
        long secondmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                thirdmax = secondmax;
                secondmax = max;
                max = arr[i];
            }
            else if (arr[i] > secondmax && arr[i] != max) {
                thirdmax = secondmax;
                secondmax = arr[i];
            }
            else if (arr[i] > thirdmax && arr[i] != secondmax && arr[i] != max) {
                thirdmax = arr[i];
            }
        }

        if (thirdmax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) thirdmax;
    }
}