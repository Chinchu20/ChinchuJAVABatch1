package day5;

import java.util.Scanner;

public class HalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
			   	System.out.print("*");
			}
			System.out.println("");
		}
		
		//reversing
		for(int i=num-1;i>=1;--i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		

	}

}
