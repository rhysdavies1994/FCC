public class CaesarCipher
{
	private int key;
	private String value;


	public CaesarCipher(int key,String value)
	{
		this.key = key;
		this.value=value;

	}


	public String encryptedValue()
	{
		String returnValue = new String();

		for(char ch: this.value.toCharArray() )
		{
			key=key%25;
			ch += key;
			returnValue= returnValue + ch;
		}

		return returnValue;
	}

	public String decryptedValue(String value)
	{
		String returnValue = new String();

		for(char ch: value.toCharArray() )
		{
			key=key%25;
			ch -= key;
			returnValue= returnValue + ch;
		}

		return returnValue;
	}

	public int getKey()
	{
		return this.key;
	}

	public String getValue()
	{
		return this.value;
	}


}

