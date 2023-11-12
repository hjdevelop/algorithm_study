import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		String a = br.readLine();
		int n = Integer.parseInt(a.split(" ")[0]);
		int x = Integer.parseInt(a.split(" ")[1]);
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] < x) {
				bw.write(arr[j] + " ");
			}
		}
		bw.flush();
		bw.close();
	}
}