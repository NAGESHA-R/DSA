#include <stdlib.h>
#include <stdio.h>
void main()
{
    //388,112
    int a=388,b=112,c=0,count=0,temp=0;
    while(a>0 && b>0){
        c=(a%10)+(b%10)+temp;
       if(c>=10){
        temp=c/10;
        count++;
        // printf("%d",temp);
       }
       else{
        temp=0;
        // printf("value:%d",temp);
       }
       
       a=a/10;
       b=b/10;
    }
    printf("Total number of carries:%d",count);
}