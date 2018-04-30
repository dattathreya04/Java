package com.MavenProject.MyMavenProject;



public class douts {
	public douts(String name) {
		System.out.println(name);
		
	}
	public douts(int number)
	{
		System.out.println(number);
	}
	public douts() {
		System.out.println("mahesh");
	}
	{
		System.out.println(678);
	}
	
	static
	{
		System.out.println("mahesh karumanchi");
	}
	public  void m1(String msg)
	{
		System.out.println("HELLO:"  +msg);
	}
	static
	{
		System.out.println("second static");
	}
    

	 public static void main(String args[]){
       {
douts d=new douts();
douts d1=new douts("ramesh");
d1.m1("dattu");
d.m1("durga");
douts d2=new douts(56);

    		
       }
}}
