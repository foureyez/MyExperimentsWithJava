package com.problem.algo; 

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class Problem {

	public static void main(String args[] ) throws Exception {
        String[] input;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t =Integer.parseInt(br.readLine());

        while(t>0){
            input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k=Integer.parseInt(input[1]);
            
            int[] array=new int[n];
            
            input = br.readLine().split(" ");
            
            for(int i=0;i<array.length;i++)
            {
                array[i] = Integer.parseInt(input[i]);
            }

            System.out.println(findingMinimumSumSubarray(array, k));
            t--;
        }


    }

	public static int findingMinimumSumSubarray(int[] values, int k) {
		int N = values.length;
		int res = values[0];
		for (int L = 0; L < N; L++) {
			for (int R = L; R < N; R++) {
				List<Integer> A = new ArrayList<Integer>();
				List<Integer> B = new ArrayList<Integer>();
				int ashu = 0;
				for (int i = 0; i < N; i++) {
					if (i >= L && i <= R) {
						A.add(values[i]);
						ashu += values[i];
					} else {
						B.add(values[i]);
					}
				}

				Collections.sort(A);

				Collections.sort(B);
				Collections.reverse(B);
				res = Math.min(res, ashu);
				for (int t = 1; t <= k; t++) {

					if (t > A.size() || t > B.size())
						break;

					ashu -= A.get(A.size() - t);
					ashu += B.get(B.size() - t);
					res = Math.min(res, ashu);
				}
			}
		}
		return res;
	}
}