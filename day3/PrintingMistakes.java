package day3;

import java.util.Scanner;

public class PrintingMistakes {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("String 1: ");
		String str1 = scan.next();
		System.out.print("\nString 2: ");
		String str2=scan.next();
		
		
		
		int length1=str1.length();
		int length2=str2.length();
		
		String last2forsecond=str2.substring(length2-2,length2);
		String last2forfirst=str1.substring(length1-2,length1);
		String first2for2=str2.substring(0,2);
		String first2for1=str1.substring(0,2);
		
		String result1=last2forsecond+str1.substring(2,length1-2)+first2for2;
		String result2=last2forfirst+str1.substring(2,length2-2)+first2for1;
		
		
		System.out.print("\nString 1: "+result1);
		System.out.print("\nString 2: "+result2);

	}

}
