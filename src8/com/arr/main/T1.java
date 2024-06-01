package com.arr.main;

public class T1 {

	public static void main(String[] args) {
		// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
		// которые кратны данному К.

		int[] A = { 2, 5, 1, 55, 3, 2 };
		int k = 5;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {

			if (A[i] % k == 0) {
				sum += A[i];
			
			} else {
				System.out.println();
				
			}
			
		}
		System.out.println("(Сумма элемнтов массива кратных k) = "+ sum);
	}

}
