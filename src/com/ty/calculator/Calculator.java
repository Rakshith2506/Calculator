package com.ty.calculator;

public class Calculator {
	
	public  static void add( int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	
	public static void sub(int c,int d)
	{
		if(c>d) 
		{
		 int res1=c-d;
		 System.out.println(res1);
		}
		else {
		       int res2=d-c;
		       System.out.println(res2);
		     }
	}
	public static void mul(int x,int y)
	{
		int res3=x*y;
		System.out.println(res3);
	}

	public  void div(int e,int f)
	{
		if(f>0) {
		int res4=e/f;
		System.out.println(res4);
		}
		else {
			System.out.println("Infinite ");
		}
	}
	
	public static void main(String[] args) {
		add(10,20);
		sub(10,50);
		mul(10,20);
		Calculator calculator = new Calculator();
		calculator.div(10, 0);
	}


}
