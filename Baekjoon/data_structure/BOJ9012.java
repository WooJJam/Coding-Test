package Baekjoon.data_structure;

import java.io.*;
import java.util.Stack;

public class BOJ9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();

		int line = Integer.parseInt(br.readLine());
		
		for (int k = 0; k < line; k++) {
			String bracket = br.readLine();
			boolean state = true;
			stack.clear();
			for (int i = 0; i < bracket.length(); i++) {
				char element = bracket.charAt(i);
				if (element == '(') {
					stack.push(bracket.charAt(i));
				} else if (element == ')' && !stack.empty()) {
					stack.pop();
				} else {
					state = false;
					break;
				}
			}
			if (state == false || !stack.empty()) {
				bw.write("NO"+"\n");
			} else {
				bw.write("YES"+"\n");
			}
		}
		br.close();
		bw.close();
	}

}
