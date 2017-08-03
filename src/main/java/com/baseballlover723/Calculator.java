package com.baseballlover723;

public class Calculator {
	public Calculator() {
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public int absoluteAdd(int x, int y) {
		return (x > 0 ? x : -x) + (y > 0 ? y : -y);
	}
}
