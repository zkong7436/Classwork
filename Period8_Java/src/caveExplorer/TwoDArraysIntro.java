package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {

	public static void main(String[] args) {
		
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
		
//		String[] xox = {"x","o","x","o","x"};
//		System.out.println(Arrays.toString(xox));
		//a 10 array prints a horizontal string
		

		//every element in a 2D array IS itself an array
		//so a for-each loops looks like this:
//		for(String[] n: arr2D){
//			System.out.println(Arrays.toString(n));
//		}
	}
	
	private static void printPic(String[][] field) {
		
		
	}

	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		for(int row=0; row<field.length; row++){
			for(int col=0; col<field[row].length; col++){
				if(mines[row][col])field[row][col]="x";
				else{
					field[row][col] = countNearby(mines,row,col);
				}
			}
		}
		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
		for(int r = row-1; r<=row+1; r++){
			for(int c = col-1; c<=col+1; c++){
				if(r<=0 && r<mines.length && c>=0 &&c<mines[c].length){
					
				}
			}
		}
		return null;
	}

	private static void plantMines(boolean[][] mines) {
		
		int numberOfMines=10;
		while(numberOfMines>0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			//this prevents the same mine being selected twice
//			while(mines[row][col]){
//				int row = (int)(Math.random()*mines.length);
//				int col = (int)(Math.random()*mines[0].length);
			
			if(!mines[row][col]){
				mines[row][col]=true;
				numberOfMines--;
			}
		}
	}

	public static void drawing(){
		String[][] arr2D = new String[8][5];
		for(int row = 0; row < arr2D.length; row++){
		
			//populate with coords
			for(int col=0; col<arr2D[row].length; col++){
				arr2D[row][col] = " ";
			}
		}
		
		for(int row=0; row<arr2D.length; row+=arr2D.length-1){
			for(int col=0; col<arr2D[row].length; col++){
				arr2D[row][col]="__";
			}
		}
		
		for(int row=1; row<arr2D.length-1; row++){
			arr2D[row][0]="|";
			arr2D[row][arr2D[row].length-1]="|";
		}
		
		arr2D[1][0]="|-";
		arr2D[1][1]="o-";
		
		for(String[] row : arr2D){
			for(String col: row){
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
