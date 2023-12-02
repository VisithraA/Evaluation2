package com.visithraa23.evaluation2;

import java.util.Scanner;

public class SumOfSubarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("arr["+i+"]=");
			arr[i]=sc.nextInt();
		}
		
	}
}
