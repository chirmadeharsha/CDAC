//Infinite loop
class Recursion1{
static int i = 0;
static void show()//recursion method
{
	++i;
	if(i<=5)//termination condition or base condition //to stop execution if condition is true.
	{
System.out.println("Hi Girls!!!");
show();//recursive call
}
public static void main(String args[])
    {

show();//call for method
     }
}