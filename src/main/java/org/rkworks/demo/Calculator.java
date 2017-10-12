package org.rkworks.demo;

public class Calculator implements ICalculator {

	
	/**
	* Add two numbers 
	* */
	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	 
	/**
	* Subtract two numbers 
	* */
	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}


	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	/**
	* Divide  two numbers , if divided by zero throw Exception
	* */
	@Override
	public int divison(int a, int b) throws Exception {
		b=0;
		int c =a/b;		
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}
	

	@Override
	public boolean equalIntegers(int a, int b) {
		boolean result = false;
		if (a == b) {
			result = true;
		}
		return result;
	}
	
}
