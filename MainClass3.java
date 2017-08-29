//Name:Yogesh Pawar Date:29/08/2017
//To elucidate concept of ClassType Casting(DownCasting)
//SuperClass
//To perform ClassType casting classes should mollyfy two conditions as-1. Should have IS-A(Inherited) relationship and 2.The object which we are going to cast should have the properties of class to which we are casting 
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
class MainClass3
{
	public static void main(String arg[])
	{	
		//Here Condition 2 is not satisfied
		Sample s1=(Sample)new Demo();		//Casting SuperClass type of object into SubClass type is called as "DownCasting". This type of cating can be only done by Explicitly.
		//Compiler will throw an error during execution(runtime) as ClassCast Exception 
		//we can avoid this exception by using "instanceof" operator(explained in program4)
	}
}


/*
output:-
Exception in thread "main" java.lang.ClassCastException: Demo cannot be cast to Sample

*/