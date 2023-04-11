class Pattern9 
{
	public static void main(String[] args) 
	{
		int n=1;
		for (int i=1;i<=3 ;i++ )
		{
			for (int j=1;j<=3 ;j++ )
			{
				System.out.print(n+" ");
				n++;
				if (n>7)
				{
					n=1;
				}
			}
				System.out.println();
		}
		
	}
}
