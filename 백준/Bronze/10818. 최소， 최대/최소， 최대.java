import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int min = arr[0];
		int max = arr[0];
		
		for(int j = 0; j < a; j++) {
			if(min > arr[j]) {
				min = arr[j];
			}
			if(max < arr[j]) {
				max = arr[j];
			}
		}
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}