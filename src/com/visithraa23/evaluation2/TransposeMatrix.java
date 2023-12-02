package com.visithraa23.evaluation2;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		TransposeMatrix matrix=new TransposeMatrix();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of matrix:");
		int n=sc.nextInt();
		int [][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("arr["+i+"]["+j+"]=");
				arr[i][j]=sc.nextInt();
			}
		}
		
		arr=matrix.swap(arr);
		System.out.println(Arrays.deepToString(arr));
	
	}

	private int[][] swap(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		return arr;
	}
}
