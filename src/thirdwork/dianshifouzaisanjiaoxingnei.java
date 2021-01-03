package thirdwork;
import java.util.Scanner;
public class dianshifouzaisanjiaoxingnei {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point`s x- and y-cooordinates:  ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double a = (200 - x ) / 200 * 100;
		double b = (100 - y ) / 100 * 200;
		
		System.out.println(x <= b && y <= a
				? "The point is in the triangle!"
				: "The point is not in the triangle!");
	}
}
