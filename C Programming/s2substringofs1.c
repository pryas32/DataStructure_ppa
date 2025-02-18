#include <stdio.h>

int main()
{
   
   //to check if s21 is a substring of s1;
  //substring and subarray both are same.
   char words[10];
  
  scanf("%s",words);
  
  char word[5];
  
  scanf("%s",word);
  
  int len=0;
  int i=0;
  while(words[i]!='\0'){
      len++;
      i++;
  }
   int len1=0;
  int i1=0;
  while(word[i1]!='\0'){
      len1++;
      i1++;
  }
  
  for(int i=0;i<=len-len1;i++)  //till which index will will i we need to move its equal to lenght of (first-second) string. 
  {
      int match=0;
      
      
      for(int j=i;j<=i+len1-1;j++)//let I am at the the jth index of string1 rtill wht index I need to move index of 1st string ie equal to length of second string+i-1
      //till this we need to check
      {
          if(words[j]!=word[j-i])//check with the zeroth index of s2.
          {
              match=1;
              break;
          }
      }
      
      
      if(match==0)
      {
          printf("s2 is a substring of s1");
          break;
      }
      
      
  }
  
  
   
    return 0;
}
