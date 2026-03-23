import java.util.Random;

public class NumberGenerator{
	public static void main(String[] args){
		Random rand = new Random();
		
		//any integer
		System.out.println(rand.nextInt());
		
		//generate a specific number
		System.out.println(rand.nextInt(20)+1);
	}
}