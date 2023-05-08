package com.cg.codinginterviewquestions;

public class HandleException {

	public static void main(String[] args) {
		int[] arr = {1,3,4,9};
		try
		{
		int value = arr[4];
		System.out.println(value);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
