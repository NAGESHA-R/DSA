#include<stdio.h>
#include<stdlib.h>
void main(){
    int a=5;
    int c=++a + ++a + ++a + ++a;
    printf("%d",c);
}