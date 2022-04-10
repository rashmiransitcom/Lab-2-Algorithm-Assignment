package com.greatlearning.project3;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		System.out.println("\n Please enter size of Transaction Array :");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println("\n Please enter the values of Array");
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("\n Enter the total no of targets that needs to be achieved");
			int targetNo = sc.nextInt();
			int target;
			int i = 0;

			while (targetNo-- != 0) {
				int flag = 0;
				System.out.print("\n Enter the value of target");
				target = sc.nextInt();
				int sum = 0;
				for (i = 0; i < n; i++) {
					sum = sum + arr[i];
					if (sum >= target) {
						System.out.print("\n Target achieved after: " + (i + 1) + " transaction");
						flag = 1;
						break;

					}
				}
				if (flag == 0) {
					System.out.println("Given target is not achieved");
				}
			}
		}
	}

}
