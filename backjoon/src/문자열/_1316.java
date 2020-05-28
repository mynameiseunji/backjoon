package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			cnt += 1;
			Set<Character> set = new HashSet<Character>();
			char[] ch = br.readLine().toCharArray();
			for (int k = 0; k < ch.length; k++) {
				if (set.contains(ch[k])) {
					if (ch[k - 1] == ch[k]) {
					} else {
						cnt--;
						k=ch.length;
					}
				} else {
					set.add(ch[k]);
				}
			}
		}
		System.out.println(cnt);
	}
}
