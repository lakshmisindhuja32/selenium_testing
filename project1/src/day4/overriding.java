package day4;

public class overriding {
	public void detail(int a1,int a2) {
		int c=a1+a2;
		System.out.println(c);
	}

}
class riding2 extends overriding{
	public void detail(int a1,int a2) {
		int d=a1+a2;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		overriding o=new overriding();
		o.detail(10,10);
	}
		

}
