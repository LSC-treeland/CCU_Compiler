#include <stdlib.h>  
#include <stdio.h>  
#include <math.h>  
//TicTacToe judger
int main()  
{  
    int square[3][3], flag = 1;  
    for (int i = 0; i < 3; i++)  {  
        for (int j = 0; j < 3; j++)  {  
            scanf("%d", &square[i][j]);  
        }  
    }  
    if (square[0][0] == square[1][1] && square[1][1] == square[2][2])  {  
        flag = 0;  
    }  
    if (square[0][2] == square[1][1] && square[1][1] == square[2][0])  {  
        flag = 0;  
    }  
    for (int i = 0; i < 3; i++)  {  
        if (square[i][0] == square[i][1] && square[i][1] == square[i][2])  {  
            flag = 0;  
        }  
        if (square[0][i] == square[1][i] && square[1][i] == square[2][i])  {  
            flag = 0;  
        }  
    }  
    if (flag == 1) {  
        printf("False\n");  
    }  
    else  {  
        printf("True\n");  
    }  
    return 0;
}
