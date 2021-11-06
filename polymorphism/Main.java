package com.technoelevate.javabasic.polymorphism;

class Main {
	public static void main(String[] args) {
		Shapes myShape = new Shapes();
		Shapes myTriangle = new Triangle();
		Shapes myCircle = new Circle();
		myShape.area();
		myTriangle.area();
		myShape.area();
		myCircle.area();
	}
}
