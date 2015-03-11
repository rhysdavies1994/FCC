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
		CaesarHelper helper = new CaesarHelper();

		while(isRunning)
		{
			
			System.out.print("Type 'encrypt','decrypt' or 'quit': ");
			choice = scanner.nextLine();
			choice = choice.toLowerCase();

			if(choice.equals("encrypt"))
			{
				cipher = helper.createCaesarFromInput();
				System.out.println("Encrypted Value: "+cipher.encryptedValue());
			}
			else if(choice.equals("decrypt"))
			{
				cipher=helper.createCaesarFromInput();
				System.out.println("Decrypted Value: "+cipher.decryptedValue(cipher.getValue()));			
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

