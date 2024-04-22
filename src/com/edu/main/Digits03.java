package com.edu.main;

class Digits03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8943;
		int o = n / 1000;
		int p = n / 100 - o * 10;
		int m = n / 10 - (n / 100) * 10;
		int r = n - (n / 10) * 10;
		int pr = o * p * m * r;
		System.out.println(o);
		System.out.println(p);
		System.out.println(m);
		System.out.println(r);
		System.out.println(pr);

	}

}
