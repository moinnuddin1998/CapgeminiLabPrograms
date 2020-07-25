package com.question1;

import java.util.Arrays;

public class StringAscending {

	public static void main(String[] args) {
		String[] list = {"abc","xy","aaa","d"};
		Arrays.sort(list, (x,y) -> Integer.compare(x.length(),y.length()));
		
		System.out.println(Arrays.deepToString(list));
		
	
	}

}
