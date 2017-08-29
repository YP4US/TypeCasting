//To elucidate dataTypeCasting (Narrowing and Wideing)
//Name:Yogesh Pawar Date:29/08/2017

class MainClass1
{
	public static void main(String arg[])
	{
		int i1=10;
		double  d1=11.10;
		double d2=(double)i1;	//converting Lower dataType value into higher one called as "Widening". It can be done by Implicitly or Explicitly
		System.out.println("Value of d2 is:"+d2);
		int i2=(int)d1;			//converting Higher dataType value into Lower one called as "Narrowing". It can be only done by Explicitly 
		System.out.println("Value of i2 is:"+i2);
	}
}

/*
output:-

Value of d2 is:10.0
Value of i2 is:11


*/