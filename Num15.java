class  Num15
{
	public static void main(String[] args) 
	{
		char ch='a';
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==2&&j==1||i==2&&j==3||i==2&&j==5||i==3&&j==1||i==3&&j==2||i==3&&j==4||i==3&&j==5||i==4&&j==1||i==4&&j==3||i==4&&j==5)
				{
					System.out.print(" "+" ");
				}
				else
				{
					System.out.print(ch+++" ");
				}
				
			}
		
		System.out.println();
		}
	}
}
