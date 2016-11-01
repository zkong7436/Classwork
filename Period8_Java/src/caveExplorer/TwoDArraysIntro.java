package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {

	public static void main(String[] args) {
//		String[] xox = {"x","o","x","o","x"};
//		System.out.println(Arrays.toString(xox));
		//a 10 array prints a horizontal string
		
		String[][] arr2D = new String[5][4];
		for(int row = 0; row < arr2D.length; row++){
		
			//populate with coords
			for(int col=0; col<arr2D[row].length; col++){
				arr2D[row][col] = " ";
			}
		}
		
		for(int row=1; row<4; row++){
			for(int col=1; col<3; col++){
				arr2D[row][col]
			}
		}
		
		for(int col=1; col<3; col++){
			arr2D[0][col]=" __ ";
			arr2D[4][col]=" __ ";
		}
		
		arr2D[1][0]="/";
		arr2D[4][3]="/";
		arr2D[1][3]="\\";
		arr2D[4][0]="\\";
		
		for(String[] row : arr2D){
			for(String col: row){
				System.out.print(col);
			}
			System.out.println();
		}
		//every element in a 2D array IS itself an array
		//so a for-each loops looks like this:
//		for(String[] n: arr2D){
//			System.out.println(Arrays.toString(n));
//		}
	}

}
