class Num 
{
	public static void main(String[] args) 
	{
		int n=1;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				System.out.print(n+++" ");
				if (i==2&&j==2||i==3&&j==3||i==4&&j==5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
		
		System.out.println();
		}
	}
}
