import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int i = 0;
    	
    	int T = scan.nextInt();
    	int arr[] = new int[T];
    	
    	for (i = 0; i < T; i++) {
    		
    		int A = scan.nextInt();
    		int B = scan.nextInt();
    		
    		arr[i] = A + B;
    		
    	}
    	scan.close();
    	
    	for (int k : arr) {
    		System.out.println(k);
    	}

    }
}