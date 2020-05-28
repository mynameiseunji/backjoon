package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//체스판 다시 칠하기
public class _1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		char[][] chess = new char[N][M];
		for (int i = 0; i < N; i++) {
			chess[i] = br.readLine().toCharArray();
		}
		int count = 0;
		int min1 = 99;
		int min2 = 99;
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				for (int x = i; x < i + 8; x++) {
					for (int y = j; y < j + 8; y++) {
						if (x % 2 == 0) {
							if ((y % 2 == 0) && chess[x][y] == 'W') {
								count++;
							}else if((y % 2 == 1) && chess[x][y] == 'B') {
								count++;
							}
						} else {
							if ((y % 2 == 1) && chess[x][y] == 'W') {
								count++;
							}else if((y % 2 == 0) && chess[x][y] == 'B') {
								count++;
							}
						}
					}
				}
				if (count < min1) {
					min1 = count;
				}
				count = 0;
			}
		}
		
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				for (int x = i; x < i + 8; x++) {
					for (int y = j; y < j + 8; y++) {
						if (x % 2 == 0) {
							if ((y % 2 == 0) && chess[x][y] == 'B') {
								count++;
							}else if((y % 2 == 1) && chess[x][y] == 'W') {
								count++;
							}
						} else {
							if ((y % 2 == 1) && chess[x][y] == 'B') {
								count++;
							}else if((y % 2 == 0) && chess[x][y] == 'W') {
								count++;
							}
						}
					}
				}
				if (count < min2) {
					min2 = count;
				}
				count = 0;
			}
		}
		System.out.println(min1 > min2 ? min2 : min1);
	}
}
