package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		StringTokenizer stk = new StringTokenizer(str," ");
		while(stk.hasMoreElements()) {
			stk.nextToken();
			cnt++;
		}
		System.out.println(cnt);
	}

}
