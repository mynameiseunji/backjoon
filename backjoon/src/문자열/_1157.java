package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String str = br.readLine();
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			int cnt = 1;
			if (map.containsKey(str.charAt(i))) {
				cnt = map.get(str.charAt(i));
				map.replace(str.charAt(i), cnt + 1);
			} else {
				map.put(str.charAt(i), cnt);
			}
		}
		Set<Character> keyset = map.keySet();
		int max = 0;
		char ch = '0';
		for (Character c : keyset) {
			if (max < map.get(c)) {
				max = map.get(c);
				ch = c;
			} else if (max == map.get(c)) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
