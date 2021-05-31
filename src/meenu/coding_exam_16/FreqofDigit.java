package meenu.coding_exam_16;

import java.util.HashMap;

/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/

public class FreqofDigit {

	void getFreqOfDigit(int[] arr) {
		HashMap<Integer, Integer> digitFreq = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (digitFreq.containsKey(arr[index]))
				digitFreq.put(arr[index], digitFreq.get(arr[index]) + 1);
			else
				digitFreq.put(arr[index], 1);
		}
		System.out.println(digitFreq);
	}

	public static void main(String[] args) {
		int[] arrOfNum = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		FreqofDigit freqofDigit = new FreqofDigit();
		freqofDigit.getFreqOfDigit(arrOfNum);
	}

}
