package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author arawat 
 * Given an array find the maximum number with prime number of
 * occurrences greater than a threshold integer.
 *
 */
public class PrimeCount {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0, threshold, output = -1;
		Map<Integer, Integer> a = new TreeMap<>(Collections.reverseOrder());

		int num = Integer.parseInt(br.readLine());
		while (i < num) {
			Integer input = Integer.parseInt(br.readLine());
			if (a.get(input) == null) {
				a.put(input, 1);
			} else {
				a.put(input, a.get(input) + 1);
			}
			i++;
		}

		threshold = Integer.parseInt(br.readLine());

		for (int j : a.keySet()) {
			int count = a.get(j);
			if (count > threshold && checkPrime(count)) {
				output = j;
				break;
			}
		}

		System.out.println(output);

	}

	public static boolean checkPrime(int n) {
		if (n == 1 || n == 0) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
