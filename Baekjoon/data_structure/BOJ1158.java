package Baekjoon.data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1158 {

	public static void main(String[] args) throws IOException {
		Queue<Integer> queue = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw.write("<");
		int num = Integer.parseInt(st.nextToken());
		for(int i=1; i<=num; i++) {
			queue.add(i);
		}
		int k= Integer.parseInt(st.nextToken());
		
		int cnt = 1;
		while(true) {
			if(cnt == k) {
				int data = queue.poll();
				if(!queue.isEmpty()) {
					bw.write(data+", ");
					cnt = 1;
				}else {
					bw.write(data+);
					break;
				}
			}else {
				int polldata = queue.poll();
				cnt++;
				queue.add(polldata);
			}
		}
		bw.write(">");
		bw.flush();
		bw.close();
	}

}
