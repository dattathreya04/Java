package com.MavenProject.MyMavenProject;

import org.testng.annotations.Test;

public class samples {
	public static void main(String[] args) {
		
	
		String s1="mahesh";
		String s2="karumanchi";
		System.out.println(s1.concat(s2));
		System.out.println(s1.toUpperCase());
		StringBuffer bn=new StringBuffer(s1);
		System.out.println(bn.reverse());
		System.out.println(s1.replace('m', 'n'));
	}

}
