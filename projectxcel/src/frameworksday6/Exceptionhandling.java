package frameworksday6;

public class Exceptionhandling {

	public static void main(String[] args) {
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			int[] x	=new int[2];
			x[0]=10;
			 x[1]=10;
			 x[2]=10;
			x[3]=10;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		

	}

}
