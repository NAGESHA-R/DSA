#include <stdio.h>
#include <stdlib.h>
void main()
{
    int a;
    printf("enter the timing:");
    scanf("%d",&a);
    int min=0,max=0;
    int e[a];
    int l[a];
    int r[a];
    printf("enter the people who entering:\n");
    for (int i=0; i<a; i++)
    {
        scanf("%d", &e[i]);
        
    }
    printf("enter the people who leaving:\n");
    for (int j= 0; j<a; j++)
    {
        scanf("%d", &l[j]);
    }
    for (int i = 0; i <a; i++)
    {
        min=(min+e[i])-l[i];
        if(max<min)
        {
            max=min;
        }
    }
    printf("max:%d",max);

}