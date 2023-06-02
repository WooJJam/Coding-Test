package Baekjoon.data_structure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2164 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int card = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=card; i++) {
			queue.add(i);
		}
		
		while(true) {
			if(queue.size() ==1) { break; }
			queue.poll();
			int num = queue.poll();
			queue.add(num);
		}
		System.out.println(queue.peek());
		
	}

}
