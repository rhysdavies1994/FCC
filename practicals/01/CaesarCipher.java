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

		for(char ch: this.value.toLowerCase().toCharArray() )
		{
			int range=('z'-'a'-1);
			key=key%range;
			ch += key;
			ch = charBetweenAscii(ch,'a','z');
			returnValue= returnValue + ch;
		}

		return returnValue;
	}

	public String decryptedValue()
	{
		String returnValue = new String();

		for(char ch: this.value.toLowerCase().toCharArray() )
		{
			int range=('z'-'a'-1);
			key=key%range;
			ch -= key;
			ch = charBetweenAscii(ch,'a','z');
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

	public char charBetweenAscii(int location, int min, int max)
	{
		int offset=0;

		//Make sure min is smaller number, max is bigger number
		int temp;
		if(min > max)
		{
			temp = max;
			max =min;
			min=max;
		}
		
		//If location falls under minimum,
		//continue through values from above. e.g z will come before a to be continuous
		if(location< min)
		{
			offset=min-location;
			location=max-offset+1;
		}
		//Else if location is above maximum
		//continue through values from below. e.g a will come after z to be continuous
		else if(location  > max)
		{
			offset=location-max;
			location = min+offset-1;
		}

		//return location as ascii character
		return (char)location;

	}


}

