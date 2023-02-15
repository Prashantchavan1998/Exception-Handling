package Exception;

public class TryAndCatch
{

	public static void main(String[] args)
	{
		int a=10,b=0;
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
