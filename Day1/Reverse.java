import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reverse=0;
        while(n!=0)
        {
         int remainder = n%10;  
	     reverse = reverse*10 + remainder;  
	     n = n/10;  
	    }
	System.out.print("Reverse of the number is "+reverse);	
	}
}