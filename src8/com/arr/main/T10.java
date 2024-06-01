package com.arr.main;

public class T10 {

	public static void main(String[] args) {
		// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
		// которых аi > i.
		int[] Arr = { 1, 33, 4, 5, -3, 74, 6 };
		System.out.print("Имеем массив вида :  ");
		for (int i = 0; i < Arr.length; i++) {
			System.out.print( Arr[i] + " ");
		}
		System.out.println("\nПри условии что значение элемента массива больше индекса(от 0 до 6) этого элемента(i>ai),получаем массив вида : ");

		for (int i = 0; i < Arr.length; i++) {

			if (Arr[i] > i) {
				System.out.print(Arr[i]+" ");
			} else {
				continue;
				

			}
		}

	}
}