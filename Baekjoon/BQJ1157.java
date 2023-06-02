package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BQJ1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int alp[] = new int[26];
		
		String str = bf.readLine();
		
		int max = 0;
		int num = 0;
		int loc=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='a') {
				num = ++alp[str.charAt(i)-'a'];
				if(max<num) {
					max = num;
					loc = str.charAt(i)-'a';
				}
			}else {
				num = ++alp[str.charAt(i)-'A'];
				if(max<num) {
					max = num;
					loc = str.charAt(i)-'A';
				}
			}
		}
		boolean state = true;
		for(int i=0; i<alp.length; i++) {
			if(max == alp[i] && loc != i) {
				state = false;
				break;
			}
		}
		if(state == false) {
			bw.write("?"+"\n");
		}else {
			bw.write((char)(loc+'A'));
		}
		bf.close();
		bw.close();
	}
}
