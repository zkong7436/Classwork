package introduction;

import java.util.Arrays;

public class Test2Review {

		private static boolean[][] grid;
	
		public static void main(String[] args){
			grid = new boolean[5][5];
			printGrid(grid);
			buttonClick(2,3);
			printGrid(grid);
		}
		
		public static void switchRow(boolean[] row, int x){
			//switch row[x-1],row[x],row[x+1] if they exist
			for(int i=-1; i<2; i++){
				if(x+i>=0 && x+i<row.length)row[x+i]=!row[x+i];
			}
		}
		
		public static void switchColumn(boolean[][] grid, int r, int c){
			//switch row[r+1][c] and row[r-1][c]
			switchIfValid(grid,r-1,c);
			switchIfValid(grid,r+1,c);
		}
		
		public static void switchIfValid(boolean[][] grid, int r, int c){
			if(r>=0 && r<grid.length && c>=0 && c<grid[r].length){
				grid[r][c]=!grid[r][c];
			}
		}
		
		public static void buttonClick(int r, int c) {
			if(r>=0 && r<grid.length){
				//technically correct but not graded
				switchRow(grid[r],c);
			}
			switchColumn(grid,r,c);
			//all above is 1 point, any error = 0 point
			
			
			//check if a single light is on
			for(int i=0; i<grid.length; i++){
				for(int j=0; j<grid[i].length; j++){
					//1 of 2 points
					if(grid[i][j])return;//1 of 2 points
				}
			}
			System.out.println("You have solved the puzzle!");
			
		}

		public static void printGrid(boolean[][] grid){
			for(boolean[] row : grid){
				for(boolean col: row){
					if(col)System.out.print("O");
					else System.out.print("X");
				}
				System.out.println();
			}
			System.out.println("--------------");
		}
}
