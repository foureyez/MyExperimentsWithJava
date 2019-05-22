package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement
 * https://practice.geeksforgeeks.org/problems/stock-buy-and-sell/0 <br/>
 * Article : https://www.geeksforgeeks.org/stock-buy-sell/
 * 
 */
public class StockBuySell {

	public static void main(String[] args) throws IOException {
		String input[];
		int stockPrice[], n;
		StringBuilder ans = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		input = br.readLine().split(" ");
		n = input.length;
		stockPrice = new int[n];

		for (int i = 0; i < n; i++) {
			stockPrice[i] = Integer.parseInt(input[i]);
		}

		for (int j = 1; j < n - 1; j++) {

		}

		System.out.println(ans.toString());

	}

}
