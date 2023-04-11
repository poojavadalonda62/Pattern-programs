class Num2
{
	public static void main(String[] args) 
	{
		boolean n=1;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==2&&j==1||i==2&&j==3||i==2&&j==4||i==2&&j==5||i==3&&j==1||i==3&&j==2||i=3&&j==5||i==4&&j==1||i==4&&j==2||i==4&&j==3||i==4&&j==5)
				{
					System.out.print(" "+" ");
				}
				else
				{
					System.out.print(n+++" ");
				}
			}
		
		System.out.println();
		}
	}
}
