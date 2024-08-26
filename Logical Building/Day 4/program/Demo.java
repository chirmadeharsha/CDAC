class Laptop{
	int memory;
	String modelName;
	String processor;
	String os;
	float price;
	
	//clickphoto and typrnotepad and sound ye methods hai
	void clickPhoto(){
		System.out.println("inside ClickPhoto()");	
	} 

	
	String typeNotepad(){
		return "Return from typeNotepad";
	} 
	

	void sound(){
		System.out.println("inside sound()");
	}

}




public class Demo{
	public static void main(String args[]){
		int a=10;  // primitive DT
		// user defined data type
		Laptop laptopObj = new Laptop();   // default, 


	//Laptop laptopObj; //error ayega(memory chahiye).
	//classN  ref of obj =keyword 
		
	//new is a keyword , used allocate memory
	// laptop();
		
		
		
		
		
		
		
	laptopObj.sound();
	laptopObj.typeNotepad();//kuch bhi show nhi hoga
	String s=laptopObj.typeNotepad();//he line nhi likhi to bhi chalega
	System.out.println(laptopObj.typeNotepad());//print honga idhar typenotepad mai jo hai vo
	//jisake classes banaye nahiye vo access nhai kar sakte agr kara toh error ayega	
		
	}
	
}




























