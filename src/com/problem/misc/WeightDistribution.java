package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.problem.array.ArrayUtil;

public class WeightDistribution {

	int[] weights = { 70, 30 };
	int[] buckets = { 0, 0 };
	int[] diff = { 0, 0 };
	int currTotal = 0;

	public static void main(String args[]) {

		WeightDistribution wDis = new WeightDistribution();

		try {
			wDis.distributeWeights();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	}

	private void distributeWeights() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tokenCount = Integer.parseInt(br.readLine());

		while (tokenCount-- > 0) {
			addToken();
		}
	}

	private void addToken() {
		currTotal = getTotalTokens();
		if (currTotal == 0) {
			int index = findMaxValuedIndex(weights);
			buckets[index]++;
			printBucketStatus();
			return;
		}

		buckets[getIndexToAddToken()]++;
		printBucketStatus();
	}

	private void printBucketStatus() {
		System.out.print("{ ");
		for (int i = 0; i < buckets.length; i++) {
			System.out.print(buckets[i] + ", ");
		}

		System.out.println("}");
	}

	private int getIndexToAddToken() {
		for (int i = 0; i < buckets.length; i++) {
			int currWeight = buckets[i] / currTotal * 100;

			if (currWeight >= weights[i]) {
				diff[i] = 0;
				continue;
			}

			diff[i] = Math.abs(currWeight - weights[i]);
		}
		ArrayUtil.printArray(diff);
		return findMaxValuedIndex(diff);
	}

	private int findMaxValuedIndex(int[] arr) {
		int max = -999999;
		int maxIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				maxIndex = i;
				max = arr[i];
			}
		}
		return maxIndex;
	}

	private int getTotalTokens() {
		int sum = 0;
		for (int i = 0; i < buckets.length; i++) {
			sum += buckets[i];
		}
		return sum;
	}

}
