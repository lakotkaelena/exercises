package by.academy.homework2;

public class Solution {
	

		
		static int pairs(int k, int[] arr) {
			int pairsCount = 0;
			for (int i=0; i<arr.length-1; i++)
	            for (int j=i+1; j<arr.length; j++)
	                if (Math.abs(arr[i]-arr[j])==k) {
	                	pairsCount++;
	                }
			return pairsCount;
		}


}
