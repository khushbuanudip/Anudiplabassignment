
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=1;i<=5;i++)//row
		{
			for(int j=5;j>=x+1;j--)//column
			{
				System.out.print(j);
			}
			for(int k=x+1;k<=5;k++)
			{
				System.out.print(k);
			}
		System.out.println();
		x=x+1;

	}

	}
	
}
