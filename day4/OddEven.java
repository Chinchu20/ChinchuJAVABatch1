package day4;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scan.nextInt();
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
				even_count+=1;
			else
				odd_count+=1;
			num=num/10;
		}
		System.out.println("Odd digits : "+odd_count);
		System.out.println("Even digits : "+even_count);
		

	}

}
