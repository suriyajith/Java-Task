package com.calculation;

public class Calculate_Param {
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
    public static char alpha(char A)
    {
    
    	return A;
    	
    }

  public static void main(String args[]) {
	  Calculate_Param para=new Calculate_Param();
	  System.out.println(para.add(180, 127));
	  System.out.println(alpha('H'));
	  
  }
}
