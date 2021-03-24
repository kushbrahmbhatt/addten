package com.add.addten.entity;

import org.springframework.lang.NonNull;

public class Sum {
	@NonNull
	private int sum;

	public Sum(int sum) {
		super();
		this.sum = sum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public static int addTen(int num) {
		return 10 + num;
	}
	
	public static int addTwoNumbers(int num1, int num2) {
		return num1 + num2;
	}
}
