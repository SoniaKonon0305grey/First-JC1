package com.arr.main;

import java.util.Scanner;

public class T8 {

	public static void main(String[] args) {
		// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
		// в нем отрицательных,
		// положительных и нулевых элементов
		Scanner sc = new Scanner(System.in);
		int n;
		int[] mas;

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		System.out.print("Сколько элементов хочешь ввести > ");
		n = sc.nextInt();
		mas = new int[(int) n];

		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=");
			mas[i] = sc.nextInt();

		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > 0) {

				count++;
				
					System.out.println("  Всего положительных " + count);
					

				}
			

			else if (mas[i] < 0) {
				count1++;
		
					System.out.println("  Всего отрицательных " + count1);

				
			}

			else if (mas[i] == 0) {
				count2++;
				
					System.out.println("  Всего нулевых " + count2);

				}
			}

		}

	}


