package com.prs.problems;

//https://www.geeksforgeeks.org/number-buildings-facing-sun/
/*
 * 
 * Given an array representing heights of buildings. The array has buildings from left to right as shown in below diagram,
 *  count number of buildings facing the sunset. 
 * It is assumed that heights of all buildings are distinct.
 * 
 * Input : arr[] = {7, 4, 8, 2, 9}
Output: 3
Explanation: As 7 is the first element, it can 
see the sunset.
4 can't see the sunset as 7 is hiding it. 
8 can see.
2 can't see the sunset.
9 also can see the sunset.
 * 
 * */

public class NumberofBuildingsFacingTheSun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] input= {7, 4, 8, 2, 9};
		
		int firstBuildingHight=input[0];
		
		int noOfBuildingCanSeeSunSet=1;
		for (int i = 1; i < input.length; i++) {
			int currentBuildingHight=input[i];
			if(firstBuildingHight<currentBuildingHight)
			{
				firstBuildingHight=currentBuildingHight;
				noOfBuildingCanSeeSunSet++;
			}
		}
		System.out.println("noOfBuildingCanSeeSunSet "+noOfBuildingCanSeeSunSet);

	}

}
