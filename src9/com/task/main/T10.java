package com.task.main;

public class T10 {


		// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		  public static void printKthRowAndPthCol(int[][] matrix, int k, int p) {
		        int m = matrix.length; // количество строк
		        int n = matrix[0].length; // количество столбцов
		        
		        if (k < m && p < n) {
		            // вывод k-й строки
		            System.out.println("k-я строка:");
		            for (int j = 0; j < n; j++) {
		                System.out.print(matrix[k][j] + " ");
		            }
		            System.out.println();
		            
		            // вывод p-го столбца
		            System.out.println("p-й столбец:");
		            for (int i = 0; i < m; i++) {
		                System.out.println(matrix[i][p]);
		            }
		        } else {
		            System.out.println("Ошибка: введенные значения k и p выходят за пределы матрицы");
		        }
		    }
		    
			public static void main(String[] args) {{
		        int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        
		        printKthRowAndPthCol(matrix, 1, 2);
		    }
		}
	}


