#include<stdio.h>
#include<stdlib.h>
void main(){
    int a=10,b=5;
   int  max=(a+b+abs(a-b))/2;
    int min=(a+b-abs(a-b))/2;
    printf("max:%d\n",max);
    printf("min:%d",min);
}