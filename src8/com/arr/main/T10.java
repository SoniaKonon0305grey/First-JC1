package com.arr.main;

public class T10 {

	public static void main(String[] args) {
		// ���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ���
		// ������� �i > i.
		int[] Arr = { 1, 33, 4, 5, -3, 74, 6 };
		System.out.print("����� ������ ���� :  ");
		for (int i = 0; i < Arr.length; i++) {
			System.out.print( Arr[i] + " ");
		}
		System.out.println("\n��� ������� ��� �������� �������� ������� ������ �������(�� 0 �� 6) ����� ��������(i>ai),�������� ������ ���� : ");

		for (int i = 0; i < Arr.length; i++) {

			if (Arr[i] > i) {
				System.out.print(Arr[i]+" ");
			} else {
				continue;
				

			}
		}

	}
}