package day6;

public class Switch {   //this class is for taking the supply of the following switches
	int ReversingSwitch;
	int FootSwitch;
	int LightSwitch;
	int SlideSwitch;
	int KnifeSwitch;
	
	
	public Switch(int R,int F,int L,int S,int K) //constructor
	{
		ReversingSwitch=R;
		FootSwitch=F;
		LightSwitch=L;
		SlideSwitch=S;
		KnifeSwitch=K;
		System.out.println("Reversing Switch : "+ReversingSwitch);
		System.out.println("Foot Switch : "+FootSwitch);
		System.out.println("Light Switch : "+LightSwitch);
		System.out.println("Slide Switch : "+SlideSwitch);
		System.out.println("Knife Switch : "+KnifeSwitch);
	}
	
	public Switch()
	{
		System.out.println("Switch created!!");
	}
	public void SwitchOn()
	{
		System.out.println("Switch working");
	}
	
	public void SwitchOff()
	{
		System.out.println("Switch not working");
	}
	
	public void Display()
	{
		System.out.println("SWITCHES AVAILABLE\n 1.Reversing Switch\n 2.Foot Switch\n 3.Light Switch\n 4.Slide Switch\n 5.Knife Switch");
	}

}
