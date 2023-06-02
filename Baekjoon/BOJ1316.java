package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		ArrayList list;

		int num = 0;
		int n = Integer.parseInt(br.readLine());

		for (int k = 0; k < n; k++) {
			String str = br.readLine();
			boolean check = true;
			list = new ArrayList<>();

			for (int i = 0; i < str.length(); i++) {
				if (i == str.length() - 1) {
					if (list.contains(str.charAt(i))) {
						check = false;
						break;
					}
				} else if ((str.charAt(i) == str.charAt(i + 1))) {
					continue;
				} else {
					if (list.contains(str.charAt(i))) {
						check = false;
						break;
					}
					list.add(str.charAt(i));
				}
			}

			if (check == true) {
				num++;
			}
		}
		bw.write(num + "\n");
		bw.close();
	}

}
