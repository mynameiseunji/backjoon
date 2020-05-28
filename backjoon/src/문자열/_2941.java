package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		String[] cro = new String[] {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0;i<cro.length;i++) {
			if(str.contains(cro[i])) {
				str = str.replaceAll(cro[i], "a");
			}
		}
		System.out.println(str.length());
	}
}
