package com.task.main;

import java.util.Random;

public class T08 {

	public static void main(String[] args) {
		// 9.Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
		// число 7 среди элементов массива.

		Random rand = new Random();
		int n = 4;
		int m = 3;
		int count = 0;
		int[][] NM = new int[n][m];
		for (int i = 0; i < NM.length; i++) {
			for (int j = 0; j < NM[i].length; j++) {
				NM[i][j] = rand.nextInt(20);
				
				
				System.out.print(NM[i][j] + "  ");
				
			}
			
			System.out.println();
			
		}
		for (int i = 0; i < NM.length; i++) {
			for (int j = 0; j < NM[i].length; j++) {
				if (NM[i][j] == 7) {
					count++;
					System.out.println();
					System.out.println("\t  7 встречается в массиве  " + count + " раза \n");
			}
	}

}}}
