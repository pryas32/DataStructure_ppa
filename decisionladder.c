#include <stdio.h>

int main(void) {

//if_elseif_else ladder


//without if there is no else 

//we use if_elseif_else condition when we want some line of code to be executed based on some condition.


// we consider ifelseifelse etc to be single entity if ut something in between them then it will give compilation error.


// we could also replace if elseif else condition with multiple if() condition but it will consume CPU efficiency as CPU needs to check for every conditions

//if elseif else can contain arithematic condition ,logical condition ,realtional condition .


// we can have nestedifelseif else 



//they are also considered as single entity if something is put in between them then will give compilation error .

//eg 


int a=40;
if(a>50)
{
	printf("%d",a);
}
else if(a>100) //note else if is written like this 
{
	printf("%d",a);
}
else{
	printf("%d is smaller then all the condition mentioned",a);
}



//nexted ifelse if else 


//witout if there is no else if or else 

int c=-100;

if(c>50)
{
	if(c<0)
	{
		
	}else if(c>30)
	{
		printf("%d is greater then 30",c);
	}else{
		printf("%d is smaller",c);
	}
}
else if(c==100){
	printf("%d is equals to 100",c);
}
else{
	if(c<0)
	{
		printf("%d is smaller than 0",c);
	}
	else {
		pritnf("%d is greater than 0",c);
	}
}





	return 0;
}
