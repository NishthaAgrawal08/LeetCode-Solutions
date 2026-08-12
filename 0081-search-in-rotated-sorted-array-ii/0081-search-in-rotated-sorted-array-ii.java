class Solution {

    public int BSearch(int arr[], int target, int start, int end) {

        int left = start;
        int right = end;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }


    public int mini(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }

        return 0;
    }


    public boolean search(int[] arr, int target) {

        int pivot = mini(arr);

        int ans1 = BSearch(arr, target, 0, pivot - 1);

        if (ans1 != -1) {
            return true;
        }

        int ans2 = BSearch(arr, target, pivot, arr.length - 1);

        if (ans2 != -1) {
            return true;
        }

        return false;
    }
}