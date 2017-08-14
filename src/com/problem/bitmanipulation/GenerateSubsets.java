package com.problem.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author abhir 
 * To generate all the possible subsets for a given set
 *
 */
public class GenerateSubsets {

    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(br.readLine());
	int i = Integer.parseInt(br.readLine());
	generateSubset();
    }

    private static void generateSubset() {
	
    }

}
