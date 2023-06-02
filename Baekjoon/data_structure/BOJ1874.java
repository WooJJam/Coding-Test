package Baekjoon.data_structure;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ1874 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n];
		Stack<Integer> stack = new Stack<>();
		int cnt = 1;
		int i = 0;
		for(int j=0; j<n; j++) {
			arr[j] = Integer.parseInt(br.readLine());
		}
		boolean state = true;
		while(i<arr.length) {
			if(cnt == 1 || i<arr.length && cnt <= arr[i]) {
				stack.push(cnt++);
				sb.append("+\n");
			}else if(stack.peek() == arr[i]) {
				stack.pop();
				sb.append("-\n");
				i++;
			}else {
				state = false;
				break;
			}
		}
		if(state == false) {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			System.out.println("NO");
		}else {
			bw.write(sb+"\n");
		}
		bw.close();
		br.close();
	}
}
