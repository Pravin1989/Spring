package com.pravin.core;

import java.util.Scanner;

public class Fibonenci_Series {

	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		int k = 2, sum = 0;
		System.out.println("Please enter number :");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		System.out.println(i);
		System.out.println(j);
		while (k < no) {
			sum = i + j;
			i = j;
			j = sum;
			k++;
			System.out.println(sum);
		}
		scan.close();
	}
}