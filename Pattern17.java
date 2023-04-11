class Pattern17 
{
	public static void main(String[] args) 
	{
		int n=1;
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4;j++)
			{
				if(j==4||i==4||i==2&&j==3||i==3&&j==2||i==3&&j==3)
				{
				
				System.out.print("*"+" ");
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
