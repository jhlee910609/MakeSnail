package com.junhee.java.quiz;

public class Quiz {

	public static void main(String[] args) {

		Quiz result = new Quiz();
		result.drawSnail(3);

	}

	public void drawSnail(int count) {

		// 총 출력해야되는 숫자의 개수
		int total = count * count;
		int array[][] = new int[count][count];
		// 아래서 변수 넣고 싶은데, 아래서 못 넣을 때. 초기화가 되어있지 않을 때 필드 구역에서 미리 초기화 해준다.

		int i = 0;
		int j = -1;
		int n = 0;

		while (n < total) {

			// 북
			for (j=j+1; j < count && n < total; j++) {
				System.out.println("북 : n="+n+", i="+i+", j="+j);
				array[i][j] = ++n;
			}
			j = j - 1;

			// 동
			for (i=i+1; i < count && n < total; i++) {
				System.out.println("동 : n="+n+", i="+i+", j="+j);
				array[i][j] = ++n;

			}
			i = i - 1;
			//j=j-1;
			// 남
			for (j=j-1; j >= 0 && n < total; j--) {
				System.out.println("남 : n="+n+", i="+i+", j="+j);
				array[i][j] = ++n;
			}
			j = j + 1;
			// 서
			for (i=i-1; i > 0 && n < total; i--) {
				System.out.println("서 : n="+n+", i="+i+", j="+j);
				array[i][j] = ++n;
			}
			i= i+1;

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
