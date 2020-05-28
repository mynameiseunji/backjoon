package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String n = br.readLine();
		int sum=0;
		for(int i=0;i<N;i++) {
			int num = n.charAt(i)-'0';
			sum+=num;
		}
		System.out.println(sum);
	}

}
