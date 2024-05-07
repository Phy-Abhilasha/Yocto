#include <stdio.h>
#include <stdlib.h>
#include "header.h"

int main(int argc, char *argv[]) {
    if (argc != 4) {
        printf("Usage: %s <num1> <operator> <num2>\n", argv[0]);
        return 1;
    }

    double num1 = atof(argv[1]);
    char operator = argv[2][0]; // Assuming a single character operator.
    double num2 = atof(argv[3]);
    double result;

    switch (operator) {
        case '+':
            result = add(num1, num2);
            break;
        case '-':
            result = subtract(num1, num2);
            break;
        case 'x' :
            result = multiply(num1, num2);
            break;
        case '/':
            result = divide(num1, num2);
            if (result == -1) {
                printf("Error: Division by zero\n");
                return 1;
            }
            break;
        default:
            printf("Invalid operator: %c\n", operator);
            return 1;
    }

    printf("Result: %.2f\n", result);
    return 0;
}


