package com.task.main;

import java.util.Random;

public class T07 {

	public static void main(String[] args) {
		// ��� ���������� ������ . ����� ����� ������� ������������� �������� ���������.
		double[][] Arr = new double[5][5];

		System.out.println("������� ���� ������ -->  ");
		Random random = new Random();

		for (int i = 1; i < Arr.length; i++) {

			for (int j = 0; j < Arr[i].length; j++) {

				Arr[i][j] = random.nextDouble(103);
				if (i < 2 || j > 3) {
					Arr[i][j] = random.nextDouble(3) * (-1);
				}

				System.out.print(Arr[i][j] + ";\t");
				if (Arr[i][j] < 0) {
					int sum = 0;
					double r = Arr[i][j];
					sum+=Math.abs(r);
					System.out.print("����� ������� ����� ����� ���� = " + sum);
	}
}}}}