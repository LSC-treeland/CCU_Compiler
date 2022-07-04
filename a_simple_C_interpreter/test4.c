void main()
{
    int num, result;

    printf("Please enter a number:");
    scanf("%d", &num);

    if (num > 10){
    	result = 10 >> 1;
    } else{
    	result = 10 << 1;
    }
    printf("num = %d , result = %d",num,result);
}
