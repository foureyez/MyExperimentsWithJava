package com.foureyez.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import com.foureyez.algorithm.sort.MergeSort;
import com.foureyez.util.ArrayUtil;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int arr[] = {1, 9, 6, 3, 8, 52, 56, 45, 65, 842, 6345, 642, 683, 24};
        int sorted[] = {1, 3, 6, 8, 9, 24, 45, 52, 56, 65, 642, 683, 842, 6345};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        Assert.assertEquals(ArrayUtil.getArrayAsString(sorted), ArrayUtil.getArrayAsString(arr));
    }
}
