package com.problem.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ContiguousElements {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, n, count, i;
        String[] input;
        Map<Integer, Integer> map = new HashMap<>();

        t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine().trim());
            input = br.readLine().split(" ");
            count = 0;

            for (i = 0; i < n; i++) {
                map.put(Integer.parseInt(input[i]), 1);
            }

            i = Integer.parseInt(input[0]);
            while (map.get(i) != null) {
                i++;
                count++;
            }

            i = Integer.parseInt(input[0]);
            while (map.get(i) != null) {
                i--;
                count++;
            }

            if (count - 1 == map.size()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
