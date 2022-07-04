#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>

int adder(int a,int b){
    return a + b;
}

/* adder */
int main()
{
    long d;
    int a,b;
    char c ;
    float f;
    short s;
    double e;
    scanf("%d",&a);
    printf("%d",a);
    adder(a,b);
    return 0;
}
