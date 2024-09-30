package assiques1.bin;
import java.util.*;
class Student{
	int roll;
	String name;
	int age;
	
	Student(){}
	Student (int roll,String name,int age)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		
	}
}

public static void display(Collection<?>c)
{
	public static void display(Collection<?> c)
	{
		if(c==null)return;
		for(Object ob: c)
		{
			System.out.println(ob);
		}
	}
	
	public static void displayMap(Map.Entry<Integer, String>){
		

		for(Map.Entry<Integer, String> entry :mymap.entrySet()) {
			
			System.out.println(entry.getKey() + ":"+entry.getValue());
		}
}
	
	public static void main(String[] args) {

		//key=roll value= name 
Map <Integer,String> mymap=new HashMap<Integer, String>();

// put() ==value same allowed key is always unique value is a object of string 
//adv retrieval fast // map.entry is a interface  map k under ka entry interface hai (nested interface)


//put() add
 mymap.put(1,"rohit");
 mymap.put(2,"neha");
 mymap.put(3,"kiran");
 mymap.put(4,"pooja");
 mymap.put(5,"radha");
 mymap.put(6,"ovi");
 
 System.out.println("map elements are");
 System.out.println(mymap);
 
 System.out.println("particular element");
 String  name =mymap.get(5);
 System.out.println(name);
 
 
 //set<String>strset;  for(String s:strset
 //using printing map values 
Set<Map.Entry<Integer, String>>mapentryset =mymap.entrySet();
// 
//for(Map.Entry<Integer, String> entry :mapentryset) {
//	 Integer k=entry.getKey();
//	 String s= entry.getValue();
//	 System.out.println(k+":"+s);
// }

System.out.println("printing  element");

//for(Map.Entry<Integer, String> entry :mymap.entrySet()) {
//	 Integer k=entry.getKey();
//	 String s= entry.getValue();
//	 System.out.println(k+":"+s);
          
	           // or
	
	//	 System.out.println(entry.getKey() + ":"+entry.getValue());

displayMap(mymap);
//keySet()
	
System.out.println("set of keys ");
Set<Integer> mykeyset= mymap.keySet();
display(mykeyset);


//values()
System.out.println("set of values ");
Collection<String> myvalues= mymap.values();
display(myvalues);

//put()  replace
System.out.println("after repalcing");
mymap.put(3,"Shraddha ");
displayMap(mymap);



//entry set is backed by map 
Set<Map.Entry<Integer, String>>mapentryset1 =mymap.entrySet();


//mymap.clear();
System.out.println("size of map" +mymap.size());


System.out.println("entery set clet=ring by after dipplay");
display(mapentryset1);

//entry set is backed by map 
//Set<Map.Entry<Integer, String>>mapentryset =mymap.entrySet();

public static void main(String args[])
{
	Map<Integer,Student>studMap=new HashMap<Integer,Stdent>();
	
	
	Student s1=new Student(1.One,"Mohan",23);
	Student s2=new Student(2.Two,"Geeta",22);
	Student s3=new Student(3.Three,"Pranjal",21);
	StudMap.put("1.One",s1);
	StudMap.put("2.Two",s1);
	StudMap.put("3.Three",s1);
	studeMap.put("4.Four",new Student(4444,"Riya",24));
	
	
	System.out.println("Map elements:");
	displayMap(studMap);
	
	
	//get(key)==>returns value or object related with that key
	Student stud=studMap.get(2);
	System.out.println("Student with roll 2:"+stud.name);
	System.out.println(stud);    
}

}	
