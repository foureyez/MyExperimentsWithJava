package com.foureyez.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWords {
	public static void main(String args[]) throws IOException {
		String input;
		char[] output;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		input = br.readLine();

		output = reverseWords(input.toCharArray());

		for (char c : output) {
			System.out.print(c);
		}
		
		System.out.println();
		for (int i = output.length - 1; i >= 0; i--) {
			System.out.print(output[i]);
		}
	}

	private static char[] reverseWords(char[] input) {
		int i = 0, start = 0, end = 0;
		while (i < input.length) {
			if (input[i] == ' ') {
				end = i - 1;
				input = reverse(start, end, input);
				start = i + 1;
			}
			
			if(i + 1 == input.length){
				end = i;
				input = reverse(start, end, input);
			}
			
			i++;
		}

		return input;
	}

	private static char[] reverse(int start, int end, char[] input) {
		char temp;
		while (start < end) {
			temp = input[start];
			input[start] = input[end];
			input[end] = temp;

			start++;
			end--;
		}
		return input;
	}
}
