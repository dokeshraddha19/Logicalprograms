package number;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n= sc.nextInt();
		sc.close();
		int reverse=0,rem;
		while(n!=0) {
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		System.out.println("The reverse number=" +reverse);
	}
		

}
