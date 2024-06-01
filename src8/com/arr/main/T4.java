package com.arr.main;

public class T4 {

	public static void main(String[] args) {
		// 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить,
		// будет ли она возрастающей.
		int[] A = { 32, 25, 17,3, 2 };

		for (int i = 0; i < A.length; ) {
			i++;
			if (A[0] < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < A[4]) {
				System.out.println("Последовательность возрастающая");
				break;
			} else if (A[0] > A[1] && A[1] > A[2] && A[2] >A[3] && A[3] > A[4]){
				System.out.println("Последовательность убывающая");
				break;
			}
			else {System.out.println("Нет порядка убывания либо возрастания");}
			break;
		}

	}

}
