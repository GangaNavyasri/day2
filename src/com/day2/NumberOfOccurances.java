package com.day2;

public class NumberOfOccurances {

	public static int findNumberOfOccurances(String[] NamesArray, String Name) {
		int count = 0;
		for(int i=0; i < NamesArray.length; i++) {
			if(NamesArray[i].compareTo(Name) == 0) {
				count++;
			}
		}
		System.out.println(count);
		return count;
}
}