import java.io.*;
import java.util.*;

public class CaesarHelper
{
	public CaesarHelper()
	{

	}

	public CaesarCipher createCaesarFromInput()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter String: ");
		String value = scanner.nextLine();

		System.out.print("Enter Key: ");
		int key = scanner.nextInt();
		scanner.nextLine();

		CaesarCipher cipher = new CaesarCipher(key,value);
		return cipher;
	}
}