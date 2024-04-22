package com.edu.main;

class Cubу03 {

	public static void main(String[] args) {
		int reb = 16;
		int sgr;
		int spov ;
		int v  ;
		
		v =(int) Math.pow(reb, 3) ;
		sgr = (int) Math.pow(reb, 2);
		spov = (int) (6*Math.pow(reb, 2));
		System.out.println("Площадь = " + sgr);
		System.out.println("Площадь поверхности = " + spov);
		System.out.println("Объем = " + v);
	}

}
