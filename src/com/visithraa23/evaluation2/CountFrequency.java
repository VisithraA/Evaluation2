package com.visithraa23.evaluation2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
	public static void main(String[] args) {
		CountFrequency countfreq = new CountFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				count++;
		}
		String[] strArr = str.split(" ");
		String ans="";
		Map<String, Integer> map = countfreq.CountStrings(strArr);
		System.out.print(map.entrySet());

	}

	private Map<String, Integer> CountStrings(String[] strArr) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < strArr.length; i++) {
			if (!map.containsKey(strArr[i]))
				map.put(strArr[i], 1);
			else
				map.put(strArr[i], map.get(strArr[i]) + 1);
		}
		return map;
	}
}
