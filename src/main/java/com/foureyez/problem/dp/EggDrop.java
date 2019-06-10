package com.foureyez.problem.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author arawat
 *         Given the number of floors and the number of eggs find the highest floor from which
 *         the egg can be dropped so that it does not break
 */
public class EggDrop {

    public static void main(String args[]) throws NumberFormatException, IOException {
        int floors, eggs;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        floors = Integer.parseInt(br.readLine());
        eggs = Integer.parseInt(br.readLine());

        EggDrop ed = new EggDrop();
        System.out.println(ed.getHighestFloorRecursive(floors, eggs));
    }

    private int getHighestFloorRecursive(int floors, int eggs) {

        if (floors == 1 || floors == 0) {
            return floors;
        }

        if (eggs == 1) {
            return floors;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= floors; i++) {
            min = Math.min(min, Math.max(getHighestFloorRecursive(i - 1, eggs - 1), getHighestFloorRecursive(floors - i, eggs)));
        }

        return min + 1;
    }

}
