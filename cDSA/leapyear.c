#include<stdio.h>
#include<stdlib.h>
int main()
{
    
     int year=2024;
     year=(year%100)-1;
     int ly=year/4;
     int nly=year-ly;
     int ans=(ly*2+nly+1)%7;
     switch (ans)
     {
     case 1:
        printf("Monday");
        break;
     case 2:
        printf("Tue");
        break;
    case 3:
        printf("Wed");
        break;
    case 4:
        printf("Thury");
        break;
    case 5:
        printf("fri");
        break;
    case 6:
        printf("sat");
        break;
    case 7:
        printf("sun");
        break;
     default:
     printf("error");
     }
    
}