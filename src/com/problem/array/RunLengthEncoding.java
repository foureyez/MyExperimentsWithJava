package com.problem.array;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String input = "wwwwaaadexxxxxx";

        encodeString(input);
    }

    private static void encodeString(String input) {
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char prev = input.charAt(i - 1);
            char curr = input.charAt(i);

            if (prev != curr) {
                System.out.print(prev + "" + count);
                count = 1;
            } else {
                count++;
            }
        }

        System.out.print(input.charAt(input.length() - 1) + "" + count);

    }
}
