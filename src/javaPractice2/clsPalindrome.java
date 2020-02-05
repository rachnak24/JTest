package javaPractice2;

public class clsPalindrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str ="rachna khanna";
		String pqr ="";
		
		
		System.out.println(str.length()-1);
		
		for(int i =str.length()-1;i>=0;i--)
		{
			pqr = pqr+str.charAt(i);
			
			//if (str==pqr)
		//	{
			//	System.out.println("it is palindrome");
			//}
			
		}
		System.out.println(pqr);

	}

}
