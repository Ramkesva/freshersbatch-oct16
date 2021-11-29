package com.example.SpringBootFirstDemo.Ass6;

public class Calci {
	
	private long a;
	private long b;
	
	public Calci() {

	}
	public void setA(long a) {
		this.a = a;
	}
	public void setB(long b) {
		this.b = b;
	}
	public long getA() {
		return a;
	}
	public long getB() {
		return b;
	}
	@Override
	public String toString() {
		return "Numbers [a=" + a + ", b=" + b + "]";
	}
	
	
}
