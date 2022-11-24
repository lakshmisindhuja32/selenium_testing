package day4;

public class singledimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[][]= {{"testingtools","QTP","UFT"},{"a","b","c"}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+" ");
			System.out.println();
		}

	}

}
