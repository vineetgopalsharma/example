package com.accolite.test;

import java.util.Scanner;

public class entry {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		a=sc.nextInt();
		while(a!=81)
		{
			System.out.println(a);
			a=sc.nextInt();
		}
		sc.close();
	}





}
