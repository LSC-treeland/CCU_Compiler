main()
{
	int x;
	double y;
	float cnt;
	scanf("%d %f",&x,&y);
	printf("%d %f\n",x,y);
    	if(x == y) ++cnt;
    	if(x != y) ++cnt;
    	if(x >= y) ++cnt;
    	if(x <= y) ++cnt;
    	if(x > y) ++cnt;
    	if(x < y) ++cnt;
}
