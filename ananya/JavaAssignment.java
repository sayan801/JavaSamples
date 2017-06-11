/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i, n;
		int numbers[] = new int[] {1112, 5, 13, 333, 54, 23, 24, 98, 34, 77};
		int s = numbers[0];
		int l = numbers[0];
		for(i = 1; i < numbers.length; i++){
			if(numbers[i] > l){
			l = numbers[i];
			}
			else if(numbers[i] < s){
			s = numbers[i];
		}
		}
		System.out.println("Min Number:" +l);
		System.out.println("Max Number:" +s);
				}
			}
		
