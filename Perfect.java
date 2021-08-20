package number;
import java.util.*;
public class Perfect {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int b;
		System.out.println("Enter a number");
		  b= sc.nextInt();
		  sc.close();
		  int result;
		  result=number(b);
		  if(result==1) {
			  System.out.println(" %d is Perfect Number");
		  }else {
			  System.out.println("%d is not Perfect Number");
		  }
	}
	public static int number(int x) {
		 
		 int i=1,count=0;
		 while(i<=x/2) {
			 if(x%i==0) {
				count=count+i; 
			 }
			 i++;
		 }
		 
		if(count==x) {
			return 1;
		}
		else {
			return 0;
		}
			
	}

}
