package javePractice1;

public class clsMain
{

	public static void main(String[] args) 
	{
		clsMethodTypes o = new clsMethodTypes();
		
		int i = o.method2();
		boolean bb = o.method3(i);
		System.out.println(bb);
		
		int x, y;
		y = 20;
		
		for(x=0;x<10;x++)
		{
		System.out.println("this is x: " + x);
		System.out.println("this is y: "  + y);
		
		y= y-2;
		}
		/*
		int num = 100;
		num = num*3;
		System.out.println(num);
		System.out.println("The value of num is" +"="+ num);
		clsA obj = new clsA();
		//String pstr = null;
	//	String pstr1 = null;
		obj.A1();
		System.out.println("i am done");
		
		IfSample sample = new IfSample();
			sample.add();
			sample.subtract();
*/
	}

}
