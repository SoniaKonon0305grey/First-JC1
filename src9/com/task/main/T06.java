package com.task.main;

public class T06 {

	public static void main(String[] args) {
		// ���� �������. ������� �� ����� ��� �������� �������, � ������� ������ ������� ������ ����������.
		int[][] Arr = { { 12, 5, 22, 16 }, 
						{ 13, 14, 5, 23 }, 
						{ 15, 8, 3, 17 },
						{ 5, 83, 35, 9 }, 
						{ 10, 48, 53, 147 } };

		System.out.println("������� ���� ������ -->  ");
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {

				System.out.print(Arr[i][j] + "  ");

			}
			System.out.println();
		}
		System.out.println("��� �������� ������� -->  ");
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
				if (j%2==0) {
					continue;
				}
				System.out.print(Arr[i][j] + "  ");

			}
			System.out.println();
		}

	}

}