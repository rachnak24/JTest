package arrays;

public class minimumNumber {
//method used for minuimum number and max number is the same just a little varation
	public static void main(String[] args)
	{
		//2 4 6
		//4 6 8
		//1 5 3
		
		int abc[][] = {{2,4,6}, {4,6,8}, {1,5,3}};
		int min = abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if( abc[i][j]<min) {
					min = abc[i][j];
				}
			}
			
		}
		
		
		System.out.println(min);
		
		
		
	}

}
