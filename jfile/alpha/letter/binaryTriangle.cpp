#include <iostream>
#include<conio.h>
int main()
{
    int i,j;
    for(i=0; i<=20; i++)
    {
        for(j=0; j<=20; j++)
        {
            if((i+j)%2==0)
            {
                printf("0");
            }
            else
            {
                printf("1");
            }
        }
        printf("\n");
    }
 getch();
 return (0);
}






    