package samplePackage;

public class ExceptionHandlinng {

	public static void main(String[] args) {
		try{
			demo();
		}
		catch(Exception e)
		{
			e.getCause();
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I am inside finally");
		}

	}
	
	public static void demo () throws Exception
	{
		System.out.println("This is Exception Handling demo");
		int i= 100/0;
		System.out.println("Completed");
	}

}
