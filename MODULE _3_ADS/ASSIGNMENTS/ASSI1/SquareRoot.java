public class SquareRoot{
  public static int SquareRoot(int x){
     int result=0;
	 while(result*result<=x){
	 result++;
	 }
	 return result-1;
	 }
	 public static void main(String[]args){
	 System.out.println(SquareRoot(16));
	  System.out.println(SquareRoot(25));
	  }
  }
	 