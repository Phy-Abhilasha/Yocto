#include "header.h"

double divide(double a, double b) {
    if (b != 0) {
        return a / b;
    } else {
        return -1; // Error: Division by zero
    }
}


