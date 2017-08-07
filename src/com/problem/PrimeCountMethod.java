package com.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class PrimeCountMethod {
	public static void main(String args[]){
		int a[] = {1,11,11,11,23,11,37,51,37,37};
		System.out.println(getLargestNumberWithPrimeOccurence(a, 2));
	}
	
	public static int getLargestNumberWithPrimeOccurence(int[] input, int minOccurence) {
		Map<Integer, Integer> sortedTree = new TreeMap<>(Collections.reverseOrder());
		int output = -1, a;
		for (int i = 0; i < input.length; i++) {
			a = input[i];
			
			if (sortedTree.get(a) == null) {
				sortedTree.put(a, 1);
			} else {
				sortedTree.put(a, sortedTree.get(a) + 1);
			}
		}

		for (int j : sortedTree.keySet()) {
			int count = sortedTree.get(j);
			if (count > minOccurence && checkPrime(count)) {
				output = j;
				break;
			}
		}
		return output;
	}

	public static boolean checkPrime(int n) {
		if (n == 1 || n == 0) {
			return false;
		}

		for (int i = 1; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
