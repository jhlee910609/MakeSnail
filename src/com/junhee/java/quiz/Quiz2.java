package com.junhee.java.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		Quiz2 result = new Quiz2();
		result.calc(5);
	}

	void calc(int count) {

		int total = count * count;
		int[][] array = new int[count][count];

		int i = 0;
		int j = 0;
		int n = 0;

		while (n < total) {
			// 북
			for (; j < count && n < total; j++) {
				array[i][j] = ++n;
				System.out.println("북 : " + "i = " + i + " j = " + j + " " + "n = " + array[i][j]);

			}

			// j 값 빼주기
			j = j - 1;

			//
			for (; i < count && n < total; i++) {
				array[i][j] = ++n;
				System.out.println("동 : " + "i = " + i + " j = " + j + " " + "n = " + array[i][j]);
			}

			i = i - 1;

			// 남
			for (j = j - 1; j >= 0 && n < total; j--) {
				array[i][j] = ++n;
				System.out.println("남 : " + "i = " + i + " j = " + j + " " + "n = " + array[i][j]);
			}
			j = j + 1;

			// 서
			i = i - 1;
			for (; i > 0 && n < total; i--) {
				array[i][j] = ++n;
				System.out.println("서 : " + "i = " + i + " j = " + j + " " + "n = " + array[i][j]);
			}
			i = i + 1;
			j = j + 1;

		}

		// 출력
		for (int k = 0; k < count; k++) {
			for (int l = 0; l < count; l++) {
				System.out.print("[" + array[k][l] + "]");
			}
			System.out.println("");
		}

	}

}
