package com.task.main;

import java.util.Random;

public class T02 {

	public static void main(String[] args) {
		// 2. ������� � ������� �� ����� ������� 2 x 3, ����������� ���������� �������
		// �� [0, 9].

		int[][] nums = new int[2][3];

		Random random = new Random();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = random.nextInt(10);
				System.out.print(nums[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
