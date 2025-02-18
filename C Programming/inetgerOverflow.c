/*
 * datatype.cpp
 *
 *  Created on: Feb 10, 2025
 *      Author: LENOVO
 */

#include<stdio.h>
#include<limits.h>// this header files contains min and max value for data type

int main(){

	// we cant hav varible of type

	//int #a=234;//this is wrong
	// we cant have like this also
	//int 1a=34;

	//int $a=23;(this is correct)
	//int @a=23;



	//integer overflow ->overflowing an integer value and reaching into some another range

	int a=2147483648;//max value of integer is 21474836477 as 1 more place so it will move in anticlockwise direction
	//and will be -MIN_Value ie
	//-2147483648
// as integer overflow has happen
	//warning means ->it means pgrm can run but it end up giving some different ouput .


	//error-> means pgrm is not fit to run
	//warning -> it means pgrm can run but it end up giving some different result.

	//Integer overflow ->its when you go beyond the range and fall in some another range.

//we cant store value greater than 2147483647 in int for that we have data type like long (4 byte or 8 byte depending upon compiler)
//	long long ->its of 8 bytes.

//	for int ->sizeof(int)-> 4 bytes ->32 bits
//
//			for every place there is 2 possiblilities either store 1 or 0
//			so we have 2^32 possibilities
//			so range is 0 to 2^32-1;

//	this will be only for positive range what about negative value for that we do half of this 2^32 =4294967296;
//	so we pass half of it to -ve one so our range starts from -2147483648 to 2147483647;



//
//	printf("%d",a);


	int e=INT_MAX;
	int b=INT_MIN;



	printf("%d%d",e,b);



return 0;



}
