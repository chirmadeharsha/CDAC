#include<stdio.h>
int sum( int num1, int num2 ){
	return num1 + num2;
}
int sub( int num1, int num2 ){
	return num1 - num2;
}
int multiplication( int num1, int num2 ){
	return num1 * num2;
}
int division( int num1, int num2 ){
	return num1 / num2;
}

typedef enum ArithmeticOperation{
	EXIT, SUM, SUB, MULTIPLICATION, DIVISION	//Enum constants
	//EXIT=0, SUM=1, SUB=2, MULTIPLICATION=3, DIVISION=4	//0,1,2,3,4: Ordinal
}ArithmeticOperation_t;

ArithmeticOperation_t menu_list( void ){
	ArithmeticOperation_t choice;
	printf("0.Exit\n");
	printf("1.Sum\n");
	printf("2.Sub\n");
	printf("3.Multiplication\n");
	printf("4.Division\n");
	printf("Enter choice	:	");
	scanf("%d", &choice);
	return choice;
}
int main( void ){
	ArithmeticOperation_t choice;
	while( ( choice = menu_list( ) ) != EXIT ){
		int result = 0;
		switch( choice ){
		case SUM:
			result = sum( 100, 20 );
			break;
		case SUB:
			result = sub( 100, 20 );
			break;
		case MULTIPLICATION:
			result = multiplication( 100, 20 );
			break;
		case DIVISION:
			result = division( 100, 20 );
			break;
		}
		printf("Result	:	%d\n",result);
	}
	return 0;
}



