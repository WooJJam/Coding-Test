package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ1008 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str  = bf.readLine();
		
		st = new StringTokenizer(str," ");
//		while(st.hasMoreTokens()) {
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
//		}
		
		System.out.println(a/b);
		bf.close();
	}

}
