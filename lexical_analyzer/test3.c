#include <stdlib.h>  
#include <stdio.h>  
#include <math.h>  
int main()  
{  
    int t1, t2, t3, t4;  
    scanf("%d %d", &t1, &t2);  
    scanf("%d %d", &t3, &t4);  
    int diff = t3 * 60 + t4 - t1 * 60 - t2;  
    int cost = 0;  
    if (diff > 120)  {  
        cost += 120;  
        diff -= 120;  
        if (diff > 120)  {  
            cost += 160;  
            diff -= 120;  
            while (diff > 30)  {  
                diff -= 30;  
                cost += 60;  
            }  
        }  
        else  {  
            while (diff >= 30)  {  
                cost += 40;  
                diff -= 30;  
            }  
        }  
    }  
    else  {  
        while (diff >= 30)  {  
            cost += 30;  
            diff -= 30;  
        }  
    }  
    printf("%d\n",cost);  
}  
