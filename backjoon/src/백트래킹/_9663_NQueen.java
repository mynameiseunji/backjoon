package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _9663_NQueen {
	static int N;
	static int[][] visited;
	static int total;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 체스판의 칸 수
		visited = new int[N][N];
		total = 0;
		chessCase(0);
		System.out.println(total);
	}

	static void chessCase(int cnt) {
		if (cnt == N) { //종료 조건 (체스말 N개 도달)
			total += 1;
			return;
		}

		for (int j = 0; j < N; j++) { //(y좌표)열 검사를 위한 반복문
			if (visited[cnt][j] == 0) {
				visited[cnt][j] = 1;
				for (int x = 0; x < cnt; x++) { //전 행(x)까지 조건 검사
					for (int y = 0; y < N; y++) {
						if(Math.abs(x-cnt)==Math.abs(y-j)||x==cnt||y==j) {
							if(visited[x][y]==1) {
								visited[cnt][j]=0;
							}
						}
					}
				}
				if(visited[cnt][j]==0) { //위의 검사에 따라 방문 표시가 지워진 경우 다음 열(y좌표) 검사
					continue;
				}else { //방문 표시가 그대로 있는 경우 간직한 채 다음 행(x좌표)로
					chessCase(cnt+1);
					visited[cnt][j]=0;
				}
			}
		}

	}

}
