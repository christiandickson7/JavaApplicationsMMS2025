public class UserDefineMethod{
	public static String UserName(String Name){
		return Name;
	}
	
	public static int checkAge(int age){
		if(age >= 18){
			System.out.println(UserDefineMethod.UserName("John Williams") + "you are an adult");
		}
		else{
			System.out.println(UserDefineMethod.UserName("John Williams") + "you are still a minor");
		}
		return age;
	}
	
	public static void main(String[] args){
		System.out.println(UserDefineMethod.checkAge(25));
	}
	
}