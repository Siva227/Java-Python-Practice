import java.util.Scanner;

public class PigLatinMain {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter word for conversion: ");
		String input = reader.next();
		reader.close();
<<<<<<< HEAD
		new PigLatinConverter(input);
		System.out.println("Hello")		
=======
		new PigLatinConverter(input);	
		System.out.println("oneDay! ;)")
>>>>>>> 915078bb6508485a4136f838d2b54cd4a58e15b4
	}
}
