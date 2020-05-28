package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2675 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String P ="";
			String ans = br.readLine();
			int R = 0;
			String S = "";
			stk = new StringTokenizer(ans, " ");
			if (stk.hasMoreTokens()) {
				R = Integer.parseInt(stk.nextToken());
			}
			if (stk.hasMoreElements()) {
				S = stk.nextToken();
			}
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					P += S.charAt(j);
				}
			}
			System.out.println(P);
		}
	}

}
