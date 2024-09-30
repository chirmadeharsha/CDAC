public class FibonaaciSeries{
      public static void displayFibonaaci(int n){
	  int first=0,second=1;
	  for(int i=0;i<n;i++){
	  System.out.println(first+"");
	  int next=first+second;
	  first=second;
	  second=next;
	  }
	 }
	 public static void main(String[]args){
	      displayFibonaaci(5);
		  System.out.println();
		  displayFibonaaci(8);
		  }
 }