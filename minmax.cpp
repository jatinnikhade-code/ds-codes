#include <stdio.h>>

int main(){
	int a,b,c ;
	int max,min;
	printf("enter three numbers:");
	scanf("%d %d %d",&a,&b,&c);
	max=a;
	min=b;
	if(b>max){
		max=b;
	}
	if(b<min){
		min=b;
	}
	if(c>max){
		max=c;
	}
	if(c<min){
		min=c;
	}
	printf("maximum number=%d\n",max);
	printf("minimum number=%d\n",min);
	return 0;
}
