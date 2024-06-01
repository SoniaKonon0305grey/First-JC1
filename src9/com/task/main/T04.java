package com.task.main;

public class T04 {

	public static void main(String[] args) {
		// 4. Дана матрица. Вывести на экран первую и последнюю строки.
		int[][] Arr = { { 12, 5, 22, 16 },
					{ 13, 14, 5, 23 },
					{ 15, 8, 3, 17 } };

		System.out.println("Выведем весь массив -->  ");
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {

				System.out.print(Arr[i][j] + "  ");

			}
			System.out.println();
		}
		System.out.println(" первая и последняя строки -->  ");
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
				if (i == 1) {
					continue;
				}
				System.out.print(Arr[i][j] + "  ");

			}
			System.out.println();
		}

	}

}
