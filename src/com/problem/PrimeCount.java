package com.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class PrimeCount {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0, k, output = -1;
		Map<Integer, Integer> a = new TreeMap<>(Collections.reverseOrder());

		int n = Integer.parseInt(br.readLine());
		while (i < n) {
			Integer input = Integer.parseInt(br.readLine());
			if (a.get(input) == null) {
				a.put(input, 1);
			} else {
				a.put(input, a.get(input) + 1);
			}
			i++;
		}

		k = Integer.parseInt(br.readLine());

		for (int j : a.keySet()) {
			int count = a.get(j);
			if (count > k && checkPrime(count)) {
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

		for (int i = 1; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
