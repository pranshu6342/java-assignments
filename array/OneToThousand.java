package com.technoelevate.javabasic.array;

public class OneToThousand {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0, index = 0;
		for (int i = 2; i < 1001; i++) {
			if (index == 5) {
				break;
			}
			if (i % 3 == 0 && i % 5 == 0) {
				arr[index] = i;
				index++;
			}
		}
		for (int x : arr) {
			sum += x;
		}
		System.out.println("sum of numbers is : " + sum);
	}
}
