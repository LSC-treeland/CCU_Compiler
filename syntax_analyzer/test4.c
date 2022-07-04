void main()
{
	int cnt = 0;
	for(int i = 0;i < 100;++i){
		for(int j = 0;j < 100;++j){
		if(i < 90)
			continue;
		else if(i > 90) 
			break;		
		}
		else{
			cnt++;
		}
	}  
}
