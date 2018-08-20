package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int min, max, x;
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            x = Integer.parseInt(br.readLine());
            input = br.readLine().split(" ");
            min = Integer.parseInt(input[0]);
            max = Integer.parseInt(input[1]);

        }
    }
}
