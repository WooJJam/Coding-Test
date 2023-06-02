package Baekjoon.data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Queue{
	private int size;
	private int ptr;
	private int[] que;
	private int front;
	private int rear;
	
	public Queue(int size) {
		que = new int[size];
		front = rear = ptr = 0;
	}
	
	void inque(int data) {
		que[rear++] = data;
		ptr++;
	}
	
	int deque() {
		if(ptr == 0) {
			return -1;
		}else {
			ptr--;
			return que[front++];
		}
	}
	
	int size() {
		return ptr;
	}
	
	int empty() {
		if(ptr>0) return 0;
		else return 1;
	}
	
	int get_front() {
		if(ptr>0) {
			return que[front];
		}else {
			return -1;
		}
	}
	
	int get_back() {
		if(ptr>0) {
			return que[rear-1];
		}else {
			return -1;
		}
	}
}

public class BOJ18258 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int size = Integer.parseInt(br.readLine());
		int data = 0;
		Queue queue = new Queue(size);
		
		for(int i=0; i<size; i++) {
			String line = br.readLine();
			st = new StringTokenizer(line);
			String word = st.nextToken();
			if(word.equals("push")) {
				data = Integer.parseInt(st.nextToken());
				queue.inque(data);
			}else if(word.equals("front")) {
				bw.write(queue.get_front()+"\n");
			}else if(word.equals("back")) {
				bw.write(queue.get_back()+"\n");
			}else if(word.equals("size")) {
				bw.write(queue.size()+"\n");
			}else if(word.equals("empty")) {
				bw.write(queue.empty()+"\n");
			}else if(word.equals("pop")) {
				bw.write(queue.deque()+"\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
