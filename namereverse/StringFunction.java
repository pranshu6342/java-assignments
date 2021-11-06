package com.technoelevate.javabasic.namereverse;

public class StringFunction {
	public static void main(String[] args) {
		String name = "my name is pranshu sen";
		String[] str = name.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}
}
