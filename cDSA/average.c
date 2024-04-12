#include<stdio.h>
#include<stdlib.h>
void main(){
    float a,s1,s2,s3,s4,r1,r2,r3,r4;
    int count=0;
    while(1){
        scanf("%f",&a);
        if(a==-1){
            break;
        }
        if(a>=0){
            s1=a;
        }
        if(a>=0 && count==1){
            s2=a;
        }
        if(a>=0 && count==2){
            s3=a;
        }
        if(a>=0 && count==3){
            s4=a;
        }
        count++;
    }
    if(a>=0 && count>0){
            r1=(s1+a)/2;
            r2=(s2+a)/2;
            r3=(s3+a)/2;
            r4=(s4+a)/2;
            printf("%f\n%f\n%f\n%f",r1,r2,r3,r4);
        }
}