package com.srccodes.day2;

public class HeightWeightConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HeightConverter(5,11));
		System.out.println(WeightConverter(60));

	}
	
	static float HeightConverter(int feet,int inch)
	{
		float total_height=(float)((feet*12 + inch)*2.54);  //conversion to cm
				return total_height;
		
	}
	
	static float WeightConverter(int weight)
	{
		float total_weight=(float)(weight*2.2);  //conversion to pounds
		return total_weight;
	}

}
