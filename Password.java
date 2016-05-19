import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Password {
	

	public static void main(String[] args){
		
		Scanner user_input = new Scanner(System.in );
		System.out.print("How long is your password>>> ");
		
		try {
			int PassLength = user_input.nextInt();
			String Result = Generate(PassLength);
			System.out.println(Result);
		}
		catch (InputMismatchException e) {
			System.out.println("Fuck Off Mate");
		}
	}
	
	public static String Generate(int Length){

		String Alpha = ("ABCDEFGHIJKLMNOPQRSTUPWXabcdefghijklmnopqrstupwxyz1234567890");
		String Password = ("");		
		
		Random random = new Random();
		String[] Dictionary = Alpha.split("");
		
			for (int x = 0; x < Length; x++){
				String randChar = Dictionary[random.nextInt(Dictionary.length)];
				Password = Password + randChar;
		}		
		
		return Password;
		}
}
