package com.arr.main;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		// ���� ������������������ ����������� ����� �1 , �2 ,..., ��. ������� ������ ��
		// ������ ����� ���� ������������������.
		// ���� ����� ����� ���, �� ������� ��������� �� ���� �����.

		
		Scanner sc = new Scanner(System.in);
		int n;
		double[] mas;
		

		System.out.print("������� ���������  ������ > ");
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