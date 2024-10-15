class BS{
     static void bsort(int a1[])
	 {
	 int n=a1.length;
	 boolean flag;
	 for(int i=0;i<n-1,i++)
	 {
	 flag=false;
	 for(int j=0;i<n-1-i;j++)
	 {
	   if(a1[j] > a1[j+1])
	   {
	      int temp = a1[j]);
		  a1[j] = a1[j+1];
		  a1[j+1] = temp;
		  flag=true;
		  }
		  
		  
		  