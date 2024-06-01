package com.task.main;

//import java.util.Random;

public class T03 {

	public static void main(String[] args) {
		// ���� �������. ������� �� ����� ������ � ��������� �������.
		int[][] Arr = { {12,5,22,16},
						{13,14,5,23},
						{15,8,3,17}
						};
		//Random random = new Random();
		System.out.println("пвар -->  ");
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
			
				System.out.print(Arr[i][j] + "  ");

				}
			System.out.println();
			}
		System.out.println(" ������ � ��������� ������� -->  ");
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
				if(j==1 || j==2) {
					continue;
				}
				System.out.print(Arr[i][j] + "  ");

				}
			System.out.println();
			}

		}
	}
