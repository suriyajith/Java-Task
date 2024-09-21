package com.calculation;

public class Calculate {
	private void add_Var() {
		int a = 659;
		int b = 477;
		int c;
		c = a + b;
		System.out.println("Value for addition:" + c);
	}

	private void sub_Var() {
		int a = 9764;
		int b = 96500;
		int c;
		c = a - b;
		System.out.println("Value for subtraction:" + c);

	}

	private void multiply_Var() {
		double a = 97.567;
		double b = 96.50;
		double c;
		c = a * b;
		System.out.println("Value for multiplication:" + c);
	}

	private void div_Var() {
		int a = 976476;
		int b = 12;
		int c;
		c = a / b;
		System.out.println("Value for division:" + c);
	}

	private void square_Var() {
		int a = 97;
		int b = a * a;
		System.out.println("Value for Square:" + b);
	}

	private void cube_Var() {
		int a = 97;
		int b = a * a * a;
		System.out.println("Value for Cube:" + b);
	}

	private void and_Var() {
		int a = 97, b = 57;
		if ((a > b) && (a != 100)) {
			System.out.println("Logical AND is TRUE");
		} else {
			System.out.println("Logical AND is FALSE");
		}
	}

	private void or_Var() {

		int a = 97, b = 57;
		if (!(a > b) || (a == 100)) {
			System.out.println("Logical OR is TRUE");
		} else {
			System.out.println("Logical OR is FALSE");
		}

	}

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println("BASIC CALCULATIONS \n");
		calc.add_Var();
		calc.sub_Var();
		calc.multiply_Var();
		calc.div_Var();
		calc.square_Var();
		calc.cube_Var();
		calc.and_Var();
		calc.or_Var();

	}
}
