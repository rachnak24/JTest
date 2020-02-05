package javePractice1;

public class IfSample 
{
	public void add()
	{
	
	int x, y;
	
		x = 10;
		y = 20;
		
		if(x < y)
		{
			System.out.println("x is less than y");
			
			x = x*2;
			if (x == y)System.out.println("x now equal to y");
		
		if (x > y)
			System.out.println("y is greater than x");
		}
		
	
	
	}
	public void subtract()
	{
		int x, y;
		
		x= 100;
		
		for(x=100; x<120; x++)
		{
			System.out.println("this is x:" + x);
			
		}
		
	}

}
