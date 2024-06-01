package com.task.main;

public class T09 {

	
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	public static void printDiagonalElements(int[][] matrix) {
        int n = matrix.length; // определяем размер квадратной матрицы

        // проходим по каждому элементу на диагонали и выводим его
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][i]);
        }
    }

        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            System.out.println("Элементы на диагонали:");
            printDiagonalElements(matrix);
        }
    }
