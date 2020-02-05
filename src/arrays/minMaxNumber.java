package arrays;

public class minMaxNumber
{

	public static void main(String[] args) 
	{
		int abc[][]= {{2,4,1},{3,0,7},{1,-2,9}};//declared and defined array
		int min=abc[0][0];//set min as a array value
		int mincolumn = 0;// defined minimum column value
		//for loop to iterate through each row
		for(int i=0;i<3;i++)
		{
			//inner for loop to iterate through each cell
			for(int j=0;j<3;j++)
			{
				//if condition to find the min number
				if(abc[i][j]<min)
				{
					//setting minimum value and assinging it under min
					min=abc[i][j];
					mincolumn=j;//assingning min cell number
					
				}
				

			}	// end of col for loop
			

		} // end of row for loop

		
		System.out.println(min);
		
		int max=abc[0][mincolumn];
				int k=0;
				while(k<3)
				{
					if(abc[k][mincolumn]>max)
					{
						max = abc[k][mincolumn];
						
					}
					k++;
				}
				System.out.println(max);
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
