package com.edu.main;

class TriangleRav03 {

	public static void main(String[] args) {
		
		
		float a;
		float S;
		float r;
		float R;
		float h;
		
		a = 15;
		
		S = (float) (Math.pow(a, 2)*Math.sqrt(3)/4);
		r = (float) (a*Math.sqrt(3)/6);
		R = (float) (a*Math.sqrt(3)/3);
		h = (float) (a*Math.sqrt(3)/2);
		System.out.println(S);
		System.out.println(r);
		System.out.println(R);
		System.out.println(h);
	}

}
