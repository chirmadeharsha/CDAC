class Person1
{
    String name;
    String address;
   
    
	
   Person1(){	}

    Person1(String a, String b){
	name = a;
	address = b;
	}

    void showData()
    {
        System.out.println("Name of Person : " + name);
        System.out.println("Address of person : " + address);
      
    }

	String showData(String a){
	System.out.println("parameter value : " + a);
	 System.out.println("Name of Person : " + name);

	return a+" "+name;
	}
    
// return statement shld always return only one value.
	


	public static void main(String arg[])
   	 {
        Person1 person1 =  new Person1("Ram","MH");
        person1.showData();
	person1.showData("abc");
        
    	}
}