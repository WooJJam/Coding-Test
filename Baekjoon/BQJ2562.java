package Baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BQJ2562 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
		int arr[] = new int[9];
		int max=0;
		int loc=0;
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			
			if(i==0) {
				max = arr[i];
				loc = i;
			}else {
				if(max<arr[i]) {
					max = arr[i];
					loc = i;
				}
			}
		}
		bw.write(max+"\n");
		bw.write((loc+1)+"\n");
		bw.flush();
		bf.close();
		bw.close();
	}
}
