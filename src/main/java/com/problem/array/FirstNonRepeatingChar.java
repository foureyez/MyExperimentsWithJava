package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Find out the first non repeating character in a given string.
 */
public class FirstNonRepeatingChar {

    private final static int MAX_CHAR_SIZE = 256;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        findFirstNonRepeatingCharacter(input);
        System.out.println("Considering input as a stream");
        findFirstNonRepeatingCharacterFromStream(input);

    }

    private static void findFirstNonRepeatingCharacter(String input) {
        int[] count = new int[MAX_CHAR_SIZE];
        boolean found = false;
        for (int i = 0; i < input.length(); i++) {
            count[(int) input.charAt(i)]++;
        }

        for (int i = 0; i < input.length(); i++) {
            if (count[(int) input.charAt(i)] == 1) {
                System.out.println(input.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No Non Repeating Character Present Overall");
        }
    }

    private static void findFirstNonRepeatingCharacterFromStream(String stream) {
        List<Character> list = new ArrayList<>();

        boolean[] isRepeated = new boolean[MAX_CHAR_SIZE];

        for (int i = 0; i < stream.length(); i++) {
            char curr = stream.charAt(i);

            if (!isRepeated[curr]) {

                if (list.contains(curr)) {
                    list.remove((Character) curr);
                    isRepeated[curr] = true;
                } else {
                    list.add(curr);
                }
            }

            if (!list.isEmpty()) {
                System.out.print(list.get(0));
            } else {
                System.out.print("-1");
            }
            System.out.print("");
        }

    }
}
