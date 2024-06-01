package com.arr.main;



public class T9 {

	public static void main(String[] args) {
		// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
		// наименьший элементы.
		int[] mas = {9,5560,44,66,5,4,545,24,56,35,45,445,};
		//int min = min(mas);
		//int max = max(mas);
		for (int i = 1; i < mas.length; i++) {

			int min = mas[0];

			if (mas[i] < min) {
				min = mas[i];
			}
		
			System.out.println("Минимальное значение: " + min);}
			for (int i = 1; i < mas.length; i++) {
			int max = mas[0];
			if (mas[i] > max) {
				max = mas[i];
			}

			System.out.println("Максимальное значение: " + max);
			/*min = mas[i];
			mas[i] = max;
			max = min;
			System.out.println("Массив теперь имеет вид : " + mas[i]);*/
			
		}

	}

}
