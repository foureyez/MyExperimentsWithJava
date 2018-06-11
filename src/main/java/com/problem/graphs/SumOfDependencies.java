package com.problem.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Given a directed graph with n nodes. If there is an edge from u to v then u
 * depends on v. Our task is to find out the sum of dependencies for every node.
 * INPUT_FORMAT : The first line of input contains an integer T denoting the no
 * of test cases. Then T test cases follow. The first line of each test case
 * contains two integers N and E denoting the no of vertices and edges of the
 * graph. Then in the next line are E pairs u and v denoting an edge from u to
 * v.
 */
public class SumOfDependencies {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int x, y, i;
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            int sum = 0;
            input = br.readLine().split(" ");
            int e = Integer.parseInt(input[1]);

            List<List<Integer>> dependencies = new ArrayList<>();

            input = br.readLine().split(" ");
            i = 0;
            while (i < e) {
                x = Integer.parseInt(input[i * 2]);
                y = Integer.parseInt(input[i * 2 + 1]);

                if (dependencies.get(x) == null) {
                    dependencies.set(x, new ArrayList<Integer>());
                    dependencies.get(x).add(y);
                } else {
                    dependencies.get(x).add(y);
                }
                i++;
            }

            for (i = 0; i < dependencies.size(); i++) {
                if (dependencies.get(i) != null) {
                    sum += dependencies.get(i).size();
                }

            }

            System.out.println(sum);
        }
    }

}
