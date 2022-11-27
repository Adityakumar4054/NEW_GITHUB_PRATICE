package oopsSamples;

public class Clasfunction extends Clsmathfunction implements UsingIstringfunction

{

	@Override
	public String Stringreverse(String rev) // instance method with argument
	{
		
		String rev1="";
		for ( int i= rev.length()-1;i>=0;i--)
		{
			rev1=rev1+rev.charAt(i);
		}
		return rev1;
	}

	@Override
	public String grtmailid(String id) // instance method with argument
	{
		return (id.substring( 0, id.indexOf('@')));
	   
	}

}
