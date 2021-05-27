package prachi.Coding_Exam_14;

/*1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
        //write your logic
}*/

import java.util.ArrayList;

public class GetPalindromeNums {
	static int[] arr = {121, 989, 1221, 951, 9999};

	public static ArrayList<Integer> getPalindromeNums(int numbers[]) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int num : numbers) {
			int temp = num;
			int reminder = 0;
			int palindromeNum = 0;
			while (temp > 0) {
				reminder = temp % 10;
				palindromeNum = palindromeNum * 10 + reminder;
				temp = temp / 10;
			}
			if (palindromeNum == num) {
				newArr.add(palindromeNum);
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> output = GetPalindromeNums.getPalindromeNums(arr);
		System.out.println("Output: "+output);
	}
}
