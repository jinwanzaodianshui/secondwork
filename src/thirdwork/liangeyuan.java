package thirdwork;
import java.util.Scanner;
public class liangeyuan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x-,y-coordinates"
				+ ", and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("Enter circle1's center x-,y-coordinates"
				+ ", and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		int rMin=(int) Math.pow(r1-r2,2);
	    int rMax=(int) Math.pow(r1+r2,2);
	    int copyR=(int)(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
	    if(rMin>copyR&&r2<r1)
	    {
	        System.out.println("circle2 is inside circle1");
	    }
	    else if(rMin==copyR)
	    {
	        System.out.println("circle2 is inside circle1");
	    }
	    else if(copyR>rMin&&copyR<rMax){
	        System.out.println("circle2 is overlaps circle1");
	    }
	    else if(copyR==rMax)
	    {
	        System.out.println("circle2 is overlaps circle1");
	    }else if(copyR>rMax)
	    {
	        System.out.println("circle2 is not overlaps circle1");
	    }
    }
}
