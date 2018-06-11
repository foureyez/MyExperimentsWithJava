package com.algorithm.search;

public class BinarySearch {

    public int search(int[] arr, int num) {
        int high = arr.length, low = 0, mid;

        // To handle the case where the array is sorted in descending order.
        boolean isReverseSorted = isArrayReverseSorted(arr);

        while (high >= low) {

            mid = (high + low) / 2;

            if (num == arr[mid]) {
                return mid;
            }

            if (num > arr[mid]) {
                if (isReverseSorted) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (num < arr[mid]) {
                if (isReverseSorted) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    private boolean isArrayReverseSorted(int[] arr) {
        if (arr[0] > arr[1]) {
            return true;
        }
        return false;
    }
}
