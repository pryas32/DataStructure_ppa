#include <stdio.h>
#include<string.h>
#include<limits.h>

// struct category{
//   int e;
//   int f;//last struc oen has primitive data type as otherwise it will create nested looping
// };

struct emp{
    char name[6];
    int x;
    int y;
    // struct category e1;
};



int main() {
// struct emp e;

// we can have array of emp 


// struct category e1={45,56};
struct emp employee[2];

for(int i=0;i<2;i++)
scanf("%s\n%d\n%d",employee[i].name,&(employee[i].x),&(employee[i].y));


int maximum=INT_MIN;

int count=0;
for(int i=0;i<2;i++)
{
    if(employee[i].x>maximum)
    {
        maximum=employee[i].x;
        count=i;
    }
}


printf("%s",employee[count].name);


// for(int i=0;i<2;i++)
// {
//     // printf("%s%d%d",employee[i].name,&(employee[i].x),&(employee[i].y));

//     printf("%s %d %d\n", employee[i].name, employee[i].x, employee[i].y);
    
    
// }






// scanf("%s%d%d",e.name,&e.x,&e.y);





  
// struct emp e2=e;//this is also way we can assign value to another struct type
 
  
  
//   printf("%s\n%d\n%d\n",e.name,e.x,e.y);
//   printf("%d\n%d",e2.x,e2.y);

    return 0;
}
