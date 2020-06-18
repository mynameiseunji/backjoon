package 정렬;

import java.io.*;
import java.util.*;

//1.나이 오름차순
//2.나이 같으면 가입순서
public class _10814 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] mem = new String[N][2];
		for (int i = 0; i < N; i++) {
			mem[i] = br.readLine().trim().split(" ");
		}

		Arrays.sort(mem, new Comparator<String[]>() {
			@Override
			public int compare(String o1[], String o2[]) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
	
		for (int i = 0; i < mem.length; i++) {
			System.out.println(mem[i][0]+" "+mem[i][1]);
		}
	}
}
