package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OverlappingRectangles {

	public static void main(String args[]) throws NumberFormatException, IOException {
		int t;
		String input[];
		int recA[] = new int[4];
		int recB[] = new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			input = br.readLine().split(" ");
			recA[0] = Integer.parseInt(input[0]);
			recA[1] = Integer.parseInt(input[1]);
			recA[2] = Integer.parseInt(input[2]);
			recA[3] = Integer.parseInt(input[3]);
			
			input = br.readLine().split(" ");
			recB[0] = Integer.parseInt(input[0]);
			recB[1] = Integer.parseInt(input[1]);
			recB[2] = Integer.parseInt(input[2]);
			recB[3] = Integer.parseInt(input[3]);
			
		}
	}
}
