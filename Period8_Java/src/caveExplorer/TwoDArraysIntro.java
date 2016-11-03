package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysIntro {
	public static Scanner in = new Scanner(System.in);
	static String[][] arr;
	static String[][] pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;
	
	public static void main(String[] args) {
		arr = new String[5][5];
		pic = new String[5][5];
		for(int row = 0; row < arr.length; row++){
			for(int col=0; col<arr[row].length; col++){
				arr[row][col] = "("+row+","+col+")";
			}
		}
		for(int row = 0; row < pic.length; row++){
			for(int col=0; col<pic[row].length; col++){
				pic[row][col] = "|__";
			}
		}
		for(int row = 0; row < pic.length; row++){
			pic[row][pic[row].length-1] = "|__|";
		}
		
		pic[2][2] = "|_x";
		starti=2;
		startj=2;
		treasurei=4;
		treasurej=3;
		
		
		startExploring();
		
		
//		String[] xox = {"x","o","x","o","x"};
//		System.out.println(Arrays.toString(xox));
		//a 10 array prints a horizontal string
		

		//every element in a 2D array IS itself an array
		//so a for-each loops looks like this:
//		for(String[] n: arr2D){
//			System.out.println(Arrays.toString(n));
//		}
		
		
//		String[][] map = new String[16][15];
//		for(int row = 0; row < map.length; row++){
//			for(int col=0; col<map[row].length; col++){
//				map[row][col] = "   ";
//			}
//		}
//		
//		for(int row = 1; row < map.length; row++){
//			for(int col=0; col<map[row].length; col+=2){
//				map[row][col] = "|";
//			}
//		}
//		
//		for(int col=0 ; col<map[0].length; col++){
//			map[0][col]="__";
//		}
//		
//		for(int row = 3; row < map.length; row+=3){
//			for(int col=1; col<map[row].length; col+=2){
//				map[row][col] = "___";
//				
//			}
//		}
		
//		
//		for(String[] row : map){
//			for(String col: row){
//				System.out.print(col);
//			}
//			System.out.println();
//		}
	}
	
	private static void startExploring() {
		while(true){
			printPic(pic);
			System.out.println("You are in room "+arr[starti][startj]+".");
			if(starti==treasurei && startj==treasurej)break;
			System.out.println("What do you want to do?");
			String input = in.nextLine(); 
			
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
			pic[starti][startj] = "|_x";
		}
		System.out.println("Congratulations! You've found the treasure.");
		
	}

	private static int[] interpretInput(String input) {
		//verify input is valid
		while(!isValid(input)){
			System.out.println("Sorry, this game, you can only use the w, a, s, d controls.");
			System.out.println("Tell me again what you would like to do.");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w"))currenti--;
		if(input.equals("a"))currentj--;
		if(input.equals("s"))currenti++;
		if(input.equals("d"))currentj++;
		int[] newCoordinates = {starti,startj};
		if(currenti >= 0 && currenti<arr.length && currentj>=0 && currentj<arr[0].length){
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}else{
			System.out.println("Sorry, you've reached the edge of the known universe. You may go no father in that direction.");
		}
		return newCoordinates;
	}

	private static boolean isValid(String input) {
		String[] validKeys = {"w","a","s","d"};
		for (String key: validKeys){
			if(input.equals(key)) return true;
		}
		return false;
	}

	public static void mineSweepier(){
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
	}
	
	private static void printPic(String[][] field) {
		for(String[] row : field){
			for(String col: row){
				System.out.print(col);
			}
			System.out.println();
		}
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

		//this method allows you to be more specific 
		//for ex., you only want North and East
		int count=0;
		count += isValdAndTrue(mines, row-1, col);
		count += isValdAndTrue(mines, row+1, col);
		count += isValdAndTrue(mines, row, col-1);
		count += isValdAndTrue(mines, row, col+1);
		return ""+count;
		
//		//this method only considers actual elements
//		int count=0;
//		for(int r=0; r<mines.length; r++){
//			for(int c=0; c<mines[r].length; c++){
//				if(Math.abs(r-row)+Math.abs(c-col)==1 && mines[r][c]){
//					count++;
//				}
//			}
//		}
//		return ""+count;
		
		
//		for(int r = row-1; r<=row+1; r++){
//			for(int c = col-1; c<=col+1; c++){
//				//checks if element exists
//				if(r<=0 && r<mines.length && c>=0 &&c<mines[c].length){
//					
//				}
//			}
//		}
//		return null;
	}

	private static int isValdAndTrue(boolean[][] mines, int i, int j) {
		if(i>=0 && i<mines.length && j>=0 && j<mines[0].length && mines[i][j]) return 1;
		return 0;
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
