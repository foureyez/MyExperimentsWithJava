package com.foureyez.algorithm.search;

import org.junit.Assert;
import org.junit.Test;

import com.foureyez.algorithm.search.BinarySearch;

public class BinarySearchTest {

    @Test
    public void testBinarySearchAscendingArray() {
        int arr[] = {2, 5, 6, 77, 87, 89, 91, 97, 123, 145, 165, 176, 189, 190, 200};
        int num = 91;
        int expectedOutput = 6;

        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(expectedOutput, binarySearch.search(arr, num));
    }

    @Test
    public void testBinarySearchDescendingArray() {
        int arr[] = {200, 198, 133, 99, 67, 56, 46, 41, 27, 11, 0};
        int num = 0;
        int expectedOutput = 10;

        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(expectedOutput, binarySearch.search(arr, num));
    }

}
