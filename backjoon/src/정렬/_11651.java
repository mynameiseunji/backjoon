package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _11651 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for(int i=0;i<N;i++) {
			String s[] = br.readLine().trim().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1],o2[1]);
			}	
		});
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}
