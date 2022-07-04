#include <stdlib.h>  
#include <stdio.h>  
#include <math.h>  
  
int main()  
{  
    int n, m, gcd;  
    scanf("%d %d", &m, &n);  
    while (n > 0 && m > 0)  {  
        if (n > m)  {  
            n = n % m;  
        }  
        else {  
            m = m % n;  
        }  
    }  
    if (n == 0)  gcd = m;  
    if (m == 0)  gcd = n;  
    printf("%d\n", gcd);  
    return 0;  
}  
