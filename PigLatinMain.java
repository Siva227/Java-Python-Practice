import java.util.Scanner;

public class PigLatinMain {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter word for conversion: ");
		String input = reader.next();
		reader.close();
		new PigLatinConverter(input);	
		System.out.println("oneDay! ;)")
	}
}
