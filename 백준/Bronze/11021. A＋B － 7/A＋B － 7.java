import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < a; i++) {
			String b = br.readLine();
			int c = Integer.parseInt(b.split(" ")[0]);
			int d = Integer.parseInt(b.split(" ")[1]);
			
			bw.write("Case #" + (i + 1) + ": " + (c + d) + "\n");
		}
		bw.flush();
	}
}