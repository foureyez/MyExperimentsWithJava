package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * MS Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB,
 * … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as “A”, column 2 as
 * “B”, column 27 as “AA”. Given a column number, find its corresponding Excel
 * column name
 */
public class ExcelColumnName {

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int columnNumber;

        columnNumber = Integer.parseInt(br.readLine());
        printColumnName(columnNumber);
    }

    private static void printColumnName(int columnNumber) {
        String columnName = "";
        int rem;

        while (columnNumber > 0) {
            rem = columnNumber % 26;
            if (rem == 0) {
                columnNumber = columnNumber / 26 - 1;
                columnName += "Z";
            } else {
                columnNumber /= 26;
                columnName += (char) (64 + rem);
            }
        }

        /**
         * Printing the reversed string if the length is greater than 1
         */
        for (int i = columnName.length() - 1; i >= 0; i--) {
            System.out.print(columnName.charAt(i));
        }
    }
}
