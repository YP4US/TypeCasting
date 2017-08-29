//Name:Yogesh Pawar Date:29/08/2017
//To elucidate concept How to avoid ClassCast Exception in  DownCasting using instanceof operator
//SuperClass
class Demo
{
	int i=11;	
}

//SubClass
class Sample extends Demo
{
	double d=11.11;
}

//MainClass
class MainClass4
{
	public static void main(String arg[])
	{	
		//UpCasting
		Demo d1=(Demo)new Sample();
		if(d1 instanceof Demo)
		{
			System.out.println("d1 has properties of both casting classes");
		}	
		else
		{
			System.out.println("d1 does not have the properties of casted class");
		}
		
	}
}


/*
output:-

d1 has properties of both casting classes
*/