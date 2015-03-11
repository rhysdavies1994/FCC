import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String value, choice;
		int key;
		CaesarCipher cipher;
		boolean isRunning=true;
		Scanner scanner = new Scanner(System.in);

		while(isRunning)
		{
			
			System.out.print("Type 'encrypt','decrypt' or 'quit': ");
			choice = scanner.nextLine();
			choice = choice.toLowerCase();

			if(choice.equals("encrypt"))
			{
				cipher = createCaesarFromInput();
				System.out.println("Encrypted Value: "+cipher.encryptedValue());
			}
			else if(choice.equals("decrypt"))
			{
				cipher=createCaesarFromInput();
				System.out.println("Decrypted Value: "+cipher.decryptedValue(value));			
			}
			else if(choice.equals("quit"))
			{
				isRunning=false;
				System.out.println("Exiting Program..");
			}
			else
			{
				System.out.println("Invalid Choice, please type encrypt or decrypt");		
			}



		}
		
	}
}

public CaesarCipher createCaesarFromInput()
{
	System.out.print("Enter String: ");
	String value = scanner.nextLine();

	System.out.print("Enter Key: ");
	int key = scanner.nextInt();
	scanner.nextLine();

	CaesarCipher cipher = new CaesarCipher(key,value);
	return cipher;
}