package Baekjoon.data_structure;
import java.io.*;
import java.util.*;

public class BOJ1935 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Double> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		String postfix = br.readLine();
		Double[] num = new Double[n];
		
		for(int i=0; i<n; i++) {
			num[i] = Double.parseDouble(br.readLine());
		}
		
		for(int i=0; i<postfix.length(); i++) {
			if(!stack.isEmpty() && (postfix.charAt(i) == '*' || postfix.charAt(i) == '/' || postfix.charAt(i) == '+' || postfix.charAt(i) == '-')) {
				double data1 = stack.pop();
				double data2 = stack.pop();
				if(postfix.charAt(i) == '*') {
					stack.push(data1 * data2);
				}else if(postfix.charAt(i) == '/') {
					stack.push(data2 / data1);
				}else if(postfix.charAt(i) == '+') {
					stack.push(data1 + data2);
				}else {
					stack.push(data2 - data1);
				}
			}else {
				stack.push(num[postfix.charAt(i)-'A']);
			}
		}
		System.out.printf("%.2f", stack.peek());
	}
}
