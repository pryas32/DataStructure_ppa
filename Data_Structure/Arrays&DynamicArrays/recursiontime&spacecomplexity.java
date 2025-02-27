/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	recursion-> there will be a caller function which will call other functions
	there is one more function called -> which is called
	
	
	in a function call stack lets say for program on factorial
	
	
	
	top to botton ->one functon calling other functon and other function calling anoher function etc
	
	so O(n) push happen in the function call stack and then O(n) pop happen in function call stack =>Overall O(n) timne complexity 
	
	or we can say in each loop on moving backward
	
	
	O(1) iteration for i=0  condition having return staement 
	after that return factorial(n-1)*N this is O(1) iteration so overall as stack size is of n having each operation as 1 eaxh so overall time complexity O(n)
	
	
	for space complexity->O(n)-> extra space equal to size of the stack
	
	
	
	
	
	
	
	
	/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	recursion-> there will be a caller function which will call other functions
	there is one more function called -> which is called
	
	
	in a function call stack lets say for program on factorial
	
	
	
	top to botton ->one functon calling other functon and other function calling anoher function etc
	
	so O(n) push happen in the function call stack and then O(n) pop happen in function call stack =>Overall O(n) timne complexity 
	
	or we can say in each loop on moving backward
	
	
	O(1) iteration for i=0  condition having return staement 
	after that return factorial(n-1)*N this is O(1) iteration so overall as stack size is of n having each operation as 1 eaxh so overall time complexity O(n)
	
	
	for space complexity->O(n)-> extra space equal to size of the stack
	
	
	
	
	
	//Recursion Tree diagram
	
	single branch recursion diagram
	
	main calling same function with smaller value 
	like 
	
	func(int n){
	
	if(i==0){
		return 1;
	}
	
	return n*func(n-1); this is single branch tree diagram
	
	
	}
	
	
	main{
   cout<<func(n)<<endl;
		
	}
		
	}
	
	
	//for multiple branch tree diagram 
	
	
	
		func(int n){
	
	if(i==0){
		return 1;
	}
	
    func(x-1);
    func(x-2);// here main function will wait for one branch to complete its execuition and then will call second branch
	
	
	}
	
	
	main{
   cout<<func(n)<<endl;
		
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	}
}
