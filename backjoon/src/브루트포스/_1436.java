package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int num = 666;
		String doom = "";
		while (N >= cnt) {
			doom = Integer.toString(num);
			if(doom.contains("666")) {
				cnt++;
			}
			num++;
		}
		System.out.println(doom);
	}
}
