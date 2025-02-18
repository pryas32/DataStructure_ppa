#include <stdio.h>
 
int main(void) {
 
//scanf-> it scans the thing until it doesnt encounters space
//for character it reads only one character
//it  deals with its ascii value
int a;
char ch;
 
 
//&ch reads only 1 character out of 100 character
scanf("%c",&ch);  
//&-> represent the address where you want to store the these variables there is no use of putting space or "\n" in scanf it doesnt effect in any way 
printf("%c",ch);
 
//%c reads everything whether its space or its nextLine.
 
	return 0;
}
 
