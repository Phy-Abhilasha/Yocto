#include<stdio.h>
#include "lib_cal.h"

int main()
{
	int a = 5, b = 10;
	int sum = add(a, b);
 	int diff = sub(a, b);
	int Mul = mul(a, b);
	int Div = div(a, b);
	int Mod =  mod(a, b);
	print(sum, diff, Mul, Div, Mod);
	return 0;
} 
