//Assignment 4 : 25th Mar 2021

//1. Create a class named as NumberGame with following method.
//a. findMaxNumber()
//method should take 3 parameters and print the maximum number from given 3 numbers.
//if all numbers are same print "Maximum number could not found, All given numbers are equals".

//b. findMinNumber()
//method should take 3 parameters and print the minimum number from given 3 numbers.
//if all numbers are same print "Minimum number could not found, All given numbers equal numbers".

//Sample input : 13,4,19
//Sample output : Maximum number is 13
//Minimum number is 4

//Sample input : 13,13,13
//Sample output : Maximum number could not found, All given numbers are identical
//Minimum number could not found, All given numbers are identical

//hint : To compare max,
//if(a>b && a>c)
//sop("a max");
//add appropiate logic for b and c.

/*
Assignment 4 - Program 1 - Program Statement : Create a class named as NumberGame with following method.
*/

package paras;

class NumberGame{
	
	void findMaxNumber(int num1, int num2, int num3){
		if(num1 > num2 && num1 > num3){
			System.out.println("Maximum number from given 3 numbers is " +num1);
		}else if(num2 > num3){
			System.out.println("Maximum number from given 3 numbers is " +num2);
		}else if(num1 == num2 &&  num1 == num3){
			System.out.println("Maximum number could not found, All given numbers are equals");
		}else{
			System.out.println("Maximum number from given 3 numbers is " +num3);
		}
	}
	
	void findMinNumber(int num1, int num2, int num3){
		if(num1 < num2 && num1 < num3){
			System.out.println("Minimum number from given 3 numbers is " +num1);
		}else if(num2 < num3){
			System.out.println("Minimum number from given 3 numbers is " +num2);
		}else if(num1 == num2 && num1 == num3){
			System.out.println("Minimum number could not found, All given numbers are equals");
		}else{
			System.out.println("Minimum number from given 3 numbers is " +num3);
		}
	}
	
	public static void main(String[] args){
		NumberGame numbergame = new NumberGame();
		numbergame.findMaxNumber(13,4,19);
		numbergame.findMaxNumber(13,13,13);
		numbergame.findMinNumber(13,4,19);
		numbergame.findMinNumber(14,14,14);
	}
}