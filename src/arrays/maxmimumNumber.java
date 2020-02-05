package arrays;

public class maxmimumNumber
{
	public static void main(String[]args)
	{
		
		int pqr[][] = {{5,6,8},{9,7,4},{8,5,3}};//declared and defined my array.
		int max = pqr[0][0];//
	
			for(int i=0;i<3;i++) //iterating through rows
			{
				for(int j=0;j<3;j++) //iterating through cells/columns
				{
					if (pqr[i][j]>max)//running if condition to find maximum number in array
					{
						max = pqr[i][j];//assinning
					}
				}
			}
	
	System.out.println(max);
	
	
	
	}	
	
}
