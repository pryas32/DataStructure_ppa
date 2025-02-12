#include <stdio.h>
#include<limits.h>

int main(void) {
//for second maximum

int x,y,z;


scanf("%d%d%d",&x,&y,&z);



//second_largest_element


int largest=INT_MIN;


if(x>=largest)
{
	largest=x;
}
if(y>=largest)
{
	largest=y;
}
if(z>=largest)
{
	largest=z;
}



int second_largest;


if(x>=largest && y>=z)
{
	second_largest=y;
}
else if(x>=largest && y<=z)
{
	second_largest=z;
}
else if(y>=largest && x>=z)
{
	second_largest=x;
}
else if(y>=largest && x<=z)
{
	second_largest=z;
}
else if(z>=largest && x>=y){
	second_largest=x;
}
else{
	second_largest=y;
}


printf("%d",second_largest);

	return 0;
}
