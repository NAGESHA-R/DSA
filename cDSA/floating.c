#include<stdio.h>
void main(){
    float n=3.56;
    int a=0;
    while(n>=1){
        a++;
        n--;
    }
    if(n>0.5){
        printf("value:%d",a+1);
    }
    else{
        printf("value:%d",a);
    }
}
