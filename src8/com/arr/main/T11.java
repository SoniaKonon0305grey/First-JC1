package com.arr.main;

public class T11 {

	public static void main(String[] args) {
		// ���� ����������� ����� �1 ,�2 ,..., �n . ������� �� �� ���, � ������� �������
		// �� ������� �� � ����� L (0 < L < �-1).
		int M = 4;
		
		double[] Arr = { 1.4, 33, 4, 5, -3.2, 74, 6 };
		System.out.print("����� ������ ���� :  ");
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + "   ");
		}
		System.out.print("\n�������� ������ ���� :  ");
		for (int i = 0; i < Arr.length; i++) {
			int L = 2;
			if(Arr[i]%M == L) {
			if (0 < L && L < (M - 1)) {
				System.out.print(Arr[i] + " ");
			}}
		}

	}

}
