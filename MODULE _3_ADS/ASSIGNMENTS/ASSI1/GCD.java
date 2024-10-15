public class GCD{
  public static int gcd(int x ,int y){
       while(y!=0){
	   int temp=y;
	   y=x%y;
	   x=temp;
	   }
	  return x;
	 }
	 public static void main(String[]args){
	   System.out.println(gcd(54,24));
	   System.out.println(gcd(24,13));
	   }
	  }
	   