import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		int temp = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int a = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < arr.length; j++) {
			if(a == arr[j]) {
				temp++;
			}
		}
		System.out.println(temp);
	}
}