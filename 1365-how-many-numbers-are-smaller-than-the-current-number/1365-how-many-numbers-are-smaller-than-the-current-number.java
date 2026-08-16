class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];

        int[] arr = nums.clone();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;
            int index = n;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (arr[mid] >= nums[i]) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            ans[i] = index;
        }

        return ans;
    }
}
