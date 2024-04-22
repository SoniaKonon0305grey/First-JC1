package com.edu.main;

class TriangleP03 {

	public static void main(String[] args) {

		int x1 = 12;
		int y1 = 3;
		int x2 = 4;
		int y2 = 11;
		int x3 = 3;
		int y3 = 2;
		int a;
		int b;
		int c;
		float S;
		int pp;
		int P;

		a = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		b = (int) Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		c = (int) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		P = a + b + c;
		pp = (a + b + c) / 2;

		S = (float)Math.sqrt(pp*(pp - a)* (pp - b) * (pp - c));
		
		System.out.println("P = " + P + "\npp = " + pp + "\nS = " + S);
		

	}

}
