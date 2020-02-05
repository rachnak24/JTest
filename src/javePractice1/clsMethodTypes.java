package javePractice1;

import java.sql.Date;

public class clsMethodTypes {

	public String method1()
	{
		int i = 0;
		int b = 7;
		int c = 10;
		int z = i+b+c;
		System.out.println(z);
		String vv = this.getClass().toString();
		
		System.out.println("I am returning String");

		return "My class " + " " + "name is --->>>> " + vv + "  my sum is  :  " + z;
	}
	
	public int method2()
	{
return 9;
	}	
	
	public boolean method3(int o)
	{
		if (o >10)
			return true;
		else 
			return false;
	}
	
	public double method4()
	{
		System.out.println("I am returning Double");
		int i = 0;
		int b = 7;
		int c = 10;
		double z = i+b+c;
		System.out.println(z);
		String vv = this.getClass().toString();


		return z;
	}
	
	public void method5()
	{
		System.out.println("I dont return anything");
		int i = 0;
		int b = 7;
		int c = 10;
		int z = i+b+c;
		System.out.println(z);
		String vv = this.getClass().toString();
		
		System.out.println("I am returning String");

		
	}
	
}
