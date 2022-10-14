package com.groupproject.eu;

public class MaximumAndMinimum {

	public static void main(String[] args) {

		// No 9. Maximum and minimum number in the array?
	               	//    0  1   2  3  4   5
		int[] number = { 12, 29, 9, 1, 85, 9 };// total elements are 6

		int min = number[0];// this means the initial value of mini is at index 0 which 12
		int max = number[0];// this means the initial value of max is at index 0 which is 12

		for (int i = 0; i < number.length; i++)

		{
			if (number[i] < min) {// at the fist iteration you are asking if 12 is less than 12
				min = number[i]; // nothing gets assigned to min so it moves down

			}
			if (number[i] > max) {// at the fist iteration you are asking if 12 is more than 12
				max = number[i]; // nothing gets assigned and 0 get incremented and moves to the next index...until last index
			}

		}
		System.out.print("Minimum is " + min + " and Maximum is " + max);
	}

}
