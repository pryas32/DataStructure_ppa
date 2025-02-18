/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include<string.h>
//string functions
int main()
{
    
    char words[100];
    
    int n;
    scanf("%d",&n);
    
    for(int i=0;i<n;i++)
    {
        scanf("%c",&words[i]);
    }
    
    
int len=strlen(words);//gives the length of the String


//strcpy;

char str[100];

strcpy(str,words);


strcat(str,words);

for(int i=0;str[i]!='\0';i++)
printf("%c",str[i]);


char *ch=strstr(str,words);

if(ch){
    printf("string found");
}
else{
    printf("string not found");
}







// printf("%d",len);


    return 0;
}
