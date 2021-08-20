package series;
import java.util.Scanner;
public class Fibbonaciseries {
	public static void main(String[] args) {
		int x;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter x");
		    x =sc.nextInt();
		    sc.close();
		int n1=0,n2=1,i;
		int n3;
		System.out.print(n1+" "+n2);
		for(i=2;i<x;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
