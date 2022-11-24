package day4;

public class polymorphism {
	public void add()
	{
		System.out.println("no parameters");
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(double c,double d)
	{
		double e=c+d;
		System.out.println(e);
	}
	public void add(String a1,String b1)
	{
		System.out.println(a1+b1);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism p=new polymorphism();
		p.add();
		p.add(2, 3);
		p.add(5.0, 6.0);
		p.add("hello", "world");
		

	}

}
