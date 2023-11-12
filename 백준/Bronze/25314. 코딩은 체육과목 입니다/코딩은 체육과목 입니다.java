import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        
        for(int i = 0; i < a / 4; i++) {
        	System.out.print("long ");
        }
        System.out.println("int");
    }
}