/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
#include <stdio.h>

int main()
{
 //indroduction to two dimensional array
 //int arr[m][n];
 //its decalred array of size m*n having elements m*n;
 
 
 // each index counting starts from 0 onwards
 
int arr[3][3]={{1,2,3},{4,5,6}};
//it decalres remaining element if not decalred as initial garbage value.


//it declares array of row size as 2 and coloumn size as 2;

for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        printf("%d",arr[i][j]);
    }
    printf("\n");
}


/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
#include <stdio.h>

int main()
{
 //indroduction to two dimensional array
 //int arr[m][n];
 //its decalred array of size m*n having elements m*n;
 
 
 // each index counting starts from 0 onwards
 
int arr[3][3]={{1,2,3},{4,5,6}};
//it decalres remaining element if not decalred as initial garbage value.


//it declares array of row size as 2 and coloumn size as 2;



//multidimensional array

int arr1[2][2][2];

//means it contains two matrixes with rows as 2 and coloumns as 2. 


for(int i=0;i<2;i++)
{
    for(int j=0;j<2;j++)
    {
        for(int k=0;k<2;k++)
        {
            printf("%d",arr1[i][j][k]);
        }
        printf("\n");
    }
    
    printf("\n");
}




 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

    return 0;
}





 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

    return 0;
}
