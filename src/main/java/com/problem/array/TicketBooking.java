package com.problem.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicketBooking {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int ticketsRequired[] = new int[n];

		for (int i = 0; i < n; i++) {
			ticketsRequired[i] = Integer.parseInt(br.readLine());
		}

		int target = Integer.parseInt(br.readLine());
		System.out.println(waitingTime(ticketsRequired, target));
	}

	private static long waitingTime(int[] ticketsRequired, int target) {
		int rotationsRequired = ticketsRequired[target];
		long waitingTime = 0;
		for (int i = 0; i < rotationsRequired; i++) {

			for (int j = 0; j < ticketsRequired.length; j++) {

				if (ticketsRequired[j] > 0) {
					ticketsRequired[j] -= 1;
					waitingTime++;
				}

				if (ticketsRequired[target] == 0) {
					break;
				}
			}

			if (ticketsRequired[target] == 0) {
				break;
			}

		}

		return waitingTime;
	}

}
