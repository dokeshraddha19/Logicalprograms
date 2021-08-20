package number;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		 n=sc.nextInt();
		 sc.close();
		int i,flag=0;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("The number is not prime");
				flag=1;
				break;
			}
		}
	    if(flag==0) {
	    	System.out.println("The number is Prime Number");
	    }
	   
		
	}

}		
		
