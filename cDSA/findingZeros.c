#include<stdio.h>
void main(){
    int n,p=0,count=0,sum=0;
    while(1){
        scanf("%d",&n);
        if(n==-1)
        {
            break;
        }
        if(n==1 && p==0){
            p=1;
        }
        if(n==1 && p>0){
            p++;
            sum+=p;
        }
        if(n==0 && p>=1){
            count++;
        }
    }
    printf("sum:%d",count);
}