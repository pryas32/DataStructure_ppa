/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
   
   char ch[100];
   
   int n;
   scanf("%d",&n);
   
   
 for(int i=0;i<n;i++)
 {
     scanf("%c",&ch[i]);
 }
   
   
   int count=0;
   for(int i=0;ch[i]!='\0';i++)
   {
       if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U')
       {
           count++;
       }
   }
   
   
   printf("%d",count);
   
   
   
   
   
   
    

    return 0;
}
