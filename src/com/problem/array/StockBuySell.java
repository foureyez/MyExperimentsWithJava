package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author arawat
 * The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. 
 * For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on day 3.
 * Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
 * 
 */
public class StockBuySell {

	public static void main(String[] args) throws IOException {
		String input[];
		int stockPrice[], n;
		boolean lookForMinima = true;
		List<Integer> buysell = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		input = br.readLine().split(" ");
		n = input.length;
		stockPrice = new int[n];

		for (int i = 0; i < n; i++) {
			stockPrice[i] = Integer.parseInt(input[i]);
		}

		for (int j = 1; j < n; j++) {
			if (stockPrice[j - 1] < stockPrice[j] && lookForMinima) {
				buysell.add(j - 1);
				lookForMinima = false;
			}

			if (stockPrice[j - 1] > stockPrice[j]) {
				buysell.add(j - 1);
				lookForMinima = true;
			}

			if (j == n - 1) {
				buysell.add(j);
			}

		}

		System.out.println(buysell.toString());

	}

}
