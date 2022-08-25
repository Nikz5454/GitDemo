package com.java.velocity;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// int i = 0;
		int m = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		sc.close();
		/*
		 * if (n == 0 || n == 1) { System.out.println("The number is not prime"); } else
		 * { for (i = 2; i <= m; i++) { if (n % i == 0 && n != 2) {
		 * System.out.println("Number is not prime"); break; } else if (n == 2) {
		 * System.out.println("Number is prime"); } else {
		 * System.out.println("Number is prime"); } }
		 * 
		 * }
		 */
		if (n == 0 || n == 1) {
			System.out.println("Number is not prime");
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				m=m+1;
			}
		}
		if (m>0) {
			System.out.println("Number is not prime");
			} else {
				System.out.println("Number is prime");
			}
		}
		
	}


