package com.arr.main;



public class T9 {

	public static void main(String[] args) {
		// ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� �
		// ���������� ��������.
		int[] mas = {9,5560,44,66,5,4,545,24,56,35,45,445,};
		//int min = min(mas);
		//int max = max(mas);
		for (int i = 1; i < mas.length; i++) {

			int min = mas[0];

			if (mas[i] < min) {
				min = mas[i];
			}
		
			System.out.println("����������� ��������: " + min);}
			for (int i = 1; i < mas.length; i++) {
			int max = mas[0];
			if (mas[i] > max) {
				max = mas[i];
			}

			System.out.println("������������ ��������: " + max);
			/*min = mas[i];
			mas[i] = max;
			max = min;
			System.out.println("������ ������ ����� ��� : " + mas[i]);*/
			
		}

	}

}
