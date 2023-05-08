package com.cg.arrays;

public class Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-2,4,-5,1};
		int count =0;
		int[] a= new int[5];
		
		for(int i=0; i<2; i++)
		{
			a[i]=1;
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				int sum=0;
				for(int k=i; k<=j; k++)
				{
					//System.out.println(arr[k]);
				 sum +=  arr[k];
				 
				}
				if(sum<0)
					count++;
				
			}
			
		}
		System.out.println(count);

	}

}
