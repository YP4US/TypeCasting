//Name:Yogesh Pawar Date:29/08/2017
//To elucidate concept of ClassType Casting(UpCasting)
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
class MainClass2
{
	public static void main(String arg[])
	{
		Demo d1=(Demo)new Sample();			//Casting SubClass type of object into SuperClass type is called as "UpCasting". This type of cating can be achieved Implicitly or Explicitly.
		System.out.println("Value of i="+d1.i);
	}
}