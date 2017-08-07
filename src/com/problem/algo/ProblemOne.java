package com.problem.algo; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author arawat
 *
 */
public class ProblemOne {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int MOD=1000000007;
		int a, s, count, i;
		String input[];
		int n = Integer.parseInt(br.readLine());

		while (n-- != 0) {
			input = br.readLine().split(" ");
			a = Integer.parseInt(input[0]);
			s = Integer.parseInt(input[1]);
			count = 0;
			if (a < s) {
				System.out.println("0");
				continue;
			} else if (a < (s * 2)) {
				System.out.println("1");
				continue;
			} else {
				System.out.println(printAllUniqueParts(a, s));
			}
		}
	}
	
	
	public static int printAllUniqueParts(int a, int s) {
		int count = 0;
	    int p[] = new int[a]; // An array to store a partition
	    int k = 0; // Index of last element in a partition
	    p[k] = a; // Initialize first partition as number itself
	    while (true) {
	    	boolean stat = printArray(p,k+1,s);
	    	if(stat){
	    		count++;
	    	}
	        int rem_val = 0;
	        while (k >= 0 && p[k] == 1) {
	            rem_val += p[k];
	            k--;
	        }
	 
	        if (k < 0)
	            return count;
	        p[k]--;
	        rem_val++;
	        while (rem_val > p[k]) {
	            p[k + 1] = p[k];
	            rem_val = rem_val - p[k];
	            k++;
	        }
	        p[k + 1] = rem_val;
	        k++;
	    }
	}
	
	public static boolean printArray(int p[], int n, int s) {
		int i;
	    for (i = 0; i < n; i++){   	
	    	if(p[i] < s){
	    		return false;
	    	}
	    }
	    return true;
	}
	

}
