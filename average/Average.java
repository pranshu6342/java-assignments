package com.technoelevate.javabasic.average;

public class Average {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0.0f;
		int arr[] = { 20, 30, 25, 35, -16, 60, -100 };
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		average = sum / arr.length;
		System.out.println("Average of given array is : " + average);
	}
}
