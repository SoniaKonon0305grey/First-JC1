package com.arr.main;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
		// четных чисел этой последовательности.
		// Если таких чисел нет, то вывести сообщение об этом факте.

		
		Scanner sc = new Scanner(System.in);
		int n;
		double[] mas;
		

		System.out.print("Сколько элементов  ввести > ");
		n = sc.nextInt();
		mas = new double[(int) n];
		int k = 2;
		for(int i=0; i<mas.length; i++) {
			System.out.print("mas[" + i + "]=");
			mas[i] = sc.nextInt();
		
			}
		for (int i = 0; i < mas.length; i++) {
			int T = 0;
			if (mas[i] % k == 0) {
				T = (int) mas[i];
				System.out.println(T);
				continue;
			}
			else if(mas[i] % k != 0) {
				continue;
			}
			System.out.print(T);
		}



	}
}