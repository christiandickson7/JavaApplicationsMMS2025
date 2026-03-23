import java.util.Scanner;

public class MethodOverloading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Calculate Area of a square");
		System.out.print("1. Calculate Area of a Rectangle");
		System.out.print("1. Calculate Area of a Triangle");
		
		System.out.print("Enter your choice ");
		int choice  = input.nextInt();
		
		switch(choice){
			case 1:
				System.out.print("Enter the length of the square ");
				int squareLength = input.nextInt();
				
				methodOverLoading.area(squareLength );
			break;
			
			case 2:
				System.out.print("Enter the length of the rectangle ");
				int rectangleLength = input .nextInt();
				
				System.out.print("Enter the length of the rectangle ");
				int rectangleLength = input .nextInt();
				
				methodOverLoading.area(rectangleLength,breadthLength); 
			break;
			
			case 3:
				System.out.print("Enter the length of the triangle ");
				int triangleLength = input .nextInt();
				
				System.out.print("Enter the base of the triangle ");
				double base = input.nextDouble();
				
					methodOverLoading.area(triangleLength,base);
			break;
			
			default:
				System.out.print("invalid input");
		}
	}
	
	public static void area(int length){
		int areaOfSquare = length * length;
		System.out.printf("The area of the square is %d",areaOfSquare);
	}
	
	public static void area(int length,int breadth){
		int areaOfRectangle = length * breadth;
		System.out.printf("The area of the rectangle is %d",areaOfRectangle);
	}
	
	public static void area(int length,double base){
		double areaOfTriangle = 0.5 * length * base;
		System.out.printf("The area of the rectangle is %.2f",areaOfTriangle);
	}
}