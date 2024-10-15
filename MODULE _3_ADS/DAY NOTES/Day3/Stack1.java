class stack1{
//dont change value throughouut........
    static final int Max=10;
    int top;
	int a[]=new int[MAX];
	stack1()
	{
	top=-1;
	}
	//-------------------------------------------------------
	
	//underflow
	boolean isEmpty()
	{
	   return (top<0);
	}
	
	//-------------------------------------------------------
	//insertion in stack 
	boolean push(int x)
	{
	if(top>=(MAx-1)){
	System.out.println("Stack overflow");
	return false;
 	}
	a[++top]=x;
	return true;
	}
	
	//---------------------------------------------------
	//deleion
	int pop(){
	if(top<0){
	System.out.println("Stack underflow");
	return 0;
	}
	
	return a [top--];
	}
	
	//----------------------------------------------------------------
	//peek-to kn ow the position
	int peek()
	{
	return (top<0)?0:a[top];
	}
	
	
	//------------------------------------------
	void display(){
		if(isEmpty(0))
		{
			System.out.println("Empty stack");
		}
		else{
			System.out.println("stacking elements are");
			show(top);
			System.out.println();
		}
		
		void show(int index){
			if(index > 0){//base condition{
				return;
			}
				System.out.println(a[index]+"");
				show(index-1);//recursive call
			}
	Public static void main(Strings args[]){
		Stack s1=new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.display();
		s1.pop();
	
		s1.display();
	
	}
	}
	//---------------------------------------------------------