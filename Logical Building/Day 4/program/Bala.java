class Laptop{
    
    int memory;
    String modelName;
    String Processor;
    String os;
    float price;

   void clickPhoto(){
     System.out.println("inside click photo"); 
    }
    String typeNotepad(){
        return"return from Notepad()";
    }
    void sound(){
        System.out.println("inside sound"); 
       }

       public class Bala{
        public static void main(String args[]){
           int a=10;
         Laptop laptopObj=new Laptop();
         laptopObj.sound();
    }
}
}

    



