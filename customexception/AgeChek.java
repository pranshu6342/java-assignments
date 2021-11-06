package com.technoelevate.javabasic.customexception;

import java.util.Scanner;

public class AgeChek {
	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your gender:");
		String gender = sc.next();
		System.out.println("please enter your age:");
		double age = sc.nextDouble();
		try {
			if (gender.equalsIgnoreCase("male")) {
				if (age >= 21) {
					System.out.println("you are eligible for marrige:");
				} else {
					throw new InvalidAgeException();
				}
			}
		} catch (InvalidAgeException e) {
			System.out.println("you are not eligible for marrige");
		}
		try {
			if (gender.equalsIgnoreCase("female")) {
				if (age >= 18) {
					System.out.println("you are eligible for marrige:");
				} else {
					throw new InvalidAgeException();
				}
			}
		} catch (InvalidAgeException e) {
			System.out.println("you are not eligible for marrige");
		}
	}
}
