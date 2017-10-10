package org.rkworks.demo;

public class Calculator implements ICalculator {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}


	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}


	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}


	@Override
	public int divison(int a, int b) throws Exception {
		b=0;
		int c =a/b;
		System.out.println(c);
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}

	
	
}
