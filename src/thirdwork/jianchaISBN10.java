package thirdwork;
import java.util.Scanner;
public class jianchaISBN10 {
	public static void main(String[] args) {
		System.out.print("Enter the first 9 digits of an"
			+ " ISBN as interger: ");
		Scanner input = new Scanner(System.in);
		int number= input.nextInt();
		int a=number;
		int b=100000000;
		int c=1;
		int sum=0;
		while(a>0) {
			sum+=a/b*c;
			a=a%b;
			b=b/10;
			c+=1;
		}
		String str = String.format("%09d", number);  
		if(sum%11==10) {
			System.out.println("The ISBN-10 number is " + str + "X" );
		}
		else {
			System.out.println("The ISBN-10 number is " + str + sum%11 );
		}
	}
}
