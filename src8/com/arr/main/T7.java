package com.arr.main;

import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {
		// . ���� ������������������ �������������� ����� �1 ,�2 ,..., ��. �������� ���
		// �� �����, ������� ������� Z, ���� ������.
		// ���������� ���������� �����.
		Scanner sc = new Scanner(System.in);
		int n;
		int[] mas;
		int Z = 20;
		int count = 0;
		System.out.print("������� ��������� ������ > ");
		n = sc.nextInt();
		mas = new int[(int) n];

		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=");
			mas[i] = sc.nextInt();

		}
		for (int i = 0; i < mas.length; i++) {
			int T = 0;
			if (mas[i] > Z) {
				mas[i] = Z;
				count++;
				System.out.println(mas[i] );
			
				
			} else if (mas[i] <= Z) {
				System.out.println(mas[i]);
				
			}
		
			
		}
		System.out.println("���������� ����� " + count);
	}

}
