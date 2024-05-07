#include<stdio.h>
#include "cal.h"

int main()
{
	int a,b,choice,result;
	printf("Enter two number:\n");
	scanf("%d%d",&a,&b);
	printf("Options:- 1.Addition\n 2.Substaction\n 3.Multiplication\n 4.Division\n 5.Modulus\n");
	printf("Enter Your choice \n");
	scanf("%d",&choice);
	int sum = add(a, b);
 	int diff = sub(a, b);
	int Mul = mul(a, b);
	int Div = div(a, b);
	int Mod =  mod(a, b);
	
	switch(choice)
	{
		case 1:
			result = add(a, b);
			break;
		case 2:
			result = sub(a, b);
			break;
		case 3:
			result = mul(a, b);
			break;
		case 4:
			result = div(a, b);
			break;
		case 5:
			result = mod(a, b);
			break;
		default:
			printf("Invalid choice\n");
			return 1;
	}
	printResult(result);
	return 0;
}
			


