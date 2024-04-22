package com.edu.main;

class Les3 {

	public static void main(String[] args) {
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
		int a = 4;
		int c = 3;
		int b = 87;
		double s;
		s = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));
		System.out.print(s);
	}

}