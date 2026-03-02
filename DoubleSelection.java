import java.util.Scanner;

public class DoubleSelection{
	public static void main(String [] args){
		Scanner scan = Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String name = scan.nextline();
		
		System.out.print("Enter your Age: ");
		int age = scan.nextline();
	
		
		if (age >= 18){
			System.out.printf("%s your age is %d, oh wow, you are now an adult",name,age);
			
		}
		else{
			System.out.printf("%s your age is %d, you are still a minor",name,age);
		}
		
	}
}