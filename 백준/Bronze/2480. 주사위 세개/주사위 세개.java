import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a == b && a == c) {
        	System.out.println(10000 + a * 1000);
        }
        else if(a == b || a == c || b == c) {
        	if(a == b || a == c) {
        		System.out.println(1000 + a * 100);
        	}
        	else {
        		System.out.println(1000 + b * 100);
        	}
        }
        else {
        	if(a > b) {
        		if(c > a) {
        			System.out.println(100 * c);
        		}
        		else {
        			System.out.println(100 * a);
        		}
        	}
        	else {
        		if(c > b) {
        			System.out.println(100 * c);
        		}
        		else {
        			System.out.println(100 * b);
        		}
        	}
        }
    }
}