package com.junhee.java.quiz;

public class MakeMySnail {

	public static void main(String[] args) {
		// printSnail(drawSnail(5));
		printSnail(makeSnail(5));
		printSnail(drawSnail(5));

	}

	final static int UP = 0;
	final static int RIGHT = 1;
	final static int DOWN = 2;
	final static int LEFT = 3;

	public static int[][] drawSnail(int count) {

		int result[][] = new int[count][count];
		int number = 1; // result 배열에 넣고 싶은 숫자
		int size = count;
		int x = -1;
		int y = 0;
		int direction = UP;

		while (number <= count * count) {
			for (int i = 0; i < size; i++) {
				switch (direction) {
				case UP:
					x++;
					break;

				case RIGHT:
					y++;
					break;

				case DOWN:
					x--;
					break;

				case LEFT:
					y--;
					break;
				}
				result[y][x] = number;
				number++;
			}
			direction++;
			if (direction == LEFT || direction == RIGHT)
				size--;
			if (direction > 3)
				direction = UP;
		}
		return result;
	}

	public static int[][] makeSnail(int count) {
		int result[][] = new int[count][count];

		int increase = 1; // 증감값
		int x = 0; // 좌표
		int y = 0;

		int number = 0;

		int snail = count * 2 - 1; // 반복하는 크기 = 가로 + 세로 -1

		for (int i = snail; i > 0; i = i - 2) {
			for (int j = 0; j < i; j++) {
				if (j <= i / 2) {
					// result [0][0] = 0 갖게 해줌 
					if(i != snail || j !=0)
					
						x += increase;
				} else {
					y += increase;
				}
				result[y][x] = ++number;
			}
			increase *= -1;
		}
		return result;
	}

	public static void printSnail(int result[][]) {
		System.out.println("-------" + "count" + result.length + "-------");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				String temp = result[i][j] < 10 ? "0" + result[i][j] : "" + result[i][j];
				System.out.printf("[%s]", temp);
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
