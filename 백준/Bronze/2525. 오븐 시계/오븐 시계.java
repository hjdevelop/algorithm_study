import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int H = scan.nextInt();
    	int M = scan.nextInt();
    	int C = scan.nextInt();
    	scan.close();
   
    	
    	if (M + C < 60) {
    		M = M + C;
    		if (H >= 24) {
    			H =  H % 24;
    		}
    		System.out.println(H + " " + M);
    	}
    	else {
    		int X = (M + C) / 60;
    		M = (M + C) % 60;
    		H = H + X;
    		if (H >= 24) {
    			H = H % 24;
    		}
    		System.out.println(H + " " + M);
    	}
    }
}