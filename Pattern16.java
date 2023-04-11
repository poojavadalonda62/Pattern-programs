class  Pattern16
{
	public static void main(String[] args) 
	{
		int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==1||i==4||)
				{
					for(int k=n+1;k<=100;k++)
					{
						n=k;
						boolean status=true;
						for(int l=2;l<n;l++)
						{
							if(n%l==0)
							{
								status=false;
							}
						}
						if(status)
						{
							System.out.print(n+" ");
							break;
						}
					}
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
