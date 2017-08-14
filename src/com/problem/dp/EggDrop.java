package com.problem.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EggDrop {

	public static void main(String args[]) throws NumberFormatException, IOException {
		int floors, eggs;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		floors = Integer.parseInt(br.readLine());
		eggs = Integer.parseInt(br.readLine());

		System.out.println(optimalDrops(eggs, floors));
	}

	public static int optimalDrops(int eggs, int floors) {
		int mat[][] = new int[eggs + 1][floors + 1];

		for (int i = 0; i < floors; i++) {
			mat[1][i] = i;
		}

		for (int i = 0; i < floors; i++) {
			mat[0][i] = 0;
		}
		
		
		for (int i = 0; i < eggs; i++) {
			mat[i][0] = 0;
		}

		for (int i = 2; i < eggs; i++) {
			for (int j = 1; j < floors; j++) {
				
				for (int x = 1; x < j; x++) {
					
				}
			}
		}
		return 0;
	}

}
