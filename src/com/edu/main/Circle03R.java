package com.edu.main;

class Circle03R {

	public static void main(String[] args) {	
		// P = 2πR  , S = πR2
		int R = 4;
		int S;
		int P;
		
		P = (int) (Math.PI*2*R);
		S = (int) (Math.PI*Math.pow(R,2));
System.out.println("P = " + P + "\nS = " + S);}

}
