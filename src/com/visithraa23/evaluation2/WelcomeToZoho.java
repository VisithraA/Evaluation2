package com.visithraa23.evaluation2;

import java.util.Arrays;
import java.util.Scanner;

public class WelcomeToZoho {
	static Scanner sc=new Scanner(System.in);	
	public static void main(String[] args) {
		WelcomeToZoho wel=new WelcomeToZoho();
		String str="WELCOMETOZOHOSCHOOLFORGRADUATESTUDIES";
		System.out.print("Enter the column:");
		int n=sc.nextInt();
		char[][] arr=new char[str.length()/n+1][n];
		arr=wel.twoDimensionArr(arr, str,n);
		
		System.out.println("Search the String");
		String search=sc.next();
		wel.SearchString(search,arr);
		
	}
	
	private void SearchString(String search, char[][] arr) {
		int top=0,bottom=arr.length-1;
		int left=0,right=arr[0].length-1;
		if(search.length()>right||search.length()>bottom) {
			System.out.println("length of the string is exceeded");
		}
		else {
			int k=0;
			String check="";
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(arr[i][j]==search.charAt(k)) {
						
					}
				}
			}
		}
		
	}

	

	private char[][] twoDimensionArr(char[][] arr,String str,int n){
		for(int i=0,k=0;i<arr.length;i++) {
			for(int j=0;j<n&&k<str.length();j++) {
				arr[i][j]=str.charAt(k++);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return arr;
	}
	
	
	
}
