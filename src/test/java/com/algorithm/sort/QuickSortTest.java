package com.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import com.util.ArrayUtil;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int arr[] = {1, 9, 6, 3, 8, 52, 56, 45, 65, 842, 6345, 642, 683, 24};
        int sorted[] = {1, 3, 6, 8, 9, 24, 45, 52, 56, 65, 642, 683, 842, 6345};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length - 1);
        Assert.assertEquals(ArrayUtil.getArrayAsString(sorted), ArrayUtil.getArrayAsString(arr));
    }
}
