package com.arr.main;

public class T2 {

		// � ������������� ������������������ ���� ������� ��������. ������� ������ �� ������� ���� ���������.

		public static int[] getIndexZeroArray(int[] array)
	    {
	        int count = 0;
	        for (int i = 0; i < array.length; i++)
	        {
	            if (array[i] == 0) count++;
	        }

	        int[] newArray = new int[count];
	        count = 0;
	        for (int i = 0; i < array.length; i++)
	        {
	            if (array[i] == 0) newArray[count++] = i;
	        }
	        return newArray;
	}
				
			

}


