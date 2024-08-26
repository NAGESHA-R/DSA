#include<stdio.h>
void main(){
    int n=53161;
    int r=0;
    // // while(n>0){
    // //     r=r*10+n/10;
    // //     printf("\nr=%d,n=%d",r,n);
    // //     n=n/10;
    // // }
    // n=(r%1000)/100+(r%10000)/1000;
    int s=((n/1000)%10)+((n/100)%10);
    printf("vslue:%d",s);
}