package trupti.scanner;
import java.util.Scanner;

public class ScannerVowel {

	void operation(char ch) {
		switch(ch) {
			case 'A':
				System.out.println("A is a vowel");
				break;
			case 'a':
				System.out.println("a is a vowel");
				break;
			case 'E':
				System.out.println("E is a vowel");
				break;
			case 'e':
				System.out.println("e is a vowel");
				break;
			case 'I':
				System.out.println("I is a vowel");
				break;
			case 'i':
				System.out.println("i is a vowel");
				break;
			case 'O':
				System.out.println("O is a vowel");
				break;
			case 'o':
				System.out.println("o is a vowel");
				break;
			case 'U':
				System.out.println("U is a vowel");
				break;
			case 'u':
				System.out.println("u is a vowel");
				break;
			default:
				System.out.println(ch+ " is not a vowel");
				break;
		}
	
	}
	public static void main(String[] args) {
		ScannerVowel scannervowel=new ScannerVowel();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter character :");
		String input=scanner.next();
		char ch=input.charAt(0);
		scannervowel.operation(ch);
		ch=input.charAt(1);
		scannervowel.operation(ch);
		ch=input.charAt(2);
		scannervowel.operation(ch);
		scanner.close();

	}

}
