package com.arr.main;



public class T3 {

	public static void main(String[] args) {
		// ���� ������������������ ����� ����� �1 �2,..., �n . ��������, ����� �����
		// ����������� ������ - ������������� ���
		// �������������.
		int[] nums = new int[4];

		nums[0] = 1;
		nums[1] = -7;
		nums[2] = 4;
		nums[3] = -5;
		for (int i = 0; i < nums.length; ) {

			if (nums[i] < 0) {
				System.out.println("� ������� ������ ���� ����������� �������������� ��������");
				break;
			} else {
				System.out.println("� ������� ������ ���� ����������� ������������� ��������");
				break;
			}
		}


	}

}
