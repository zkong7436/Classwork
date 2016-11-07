package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {

	public static CaveRoomPd8[][] caves;
	public static Scanner in;
	public static CaveRoomPd8 currentRoom;
	public static InventoryNockles inventory;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		caves = new CaveRoomPd8[5][5];
		for (int row=0; row<caves.length; row++){
			
			for (int col=0; col<caves[row].length; col++){
				
				caves[row][col] = new CaveRoomPd8("This room has coordinates ("+row+","+col+").");
			}
		}
		
		currentRoom = caves[1][2];
		caves[1][3]=new EventRoom("This is where you found the map.",new GameStartEvent());
		currentRoom.enter();
		caves[1][2].setConnection(CaveRoomPd8.WEST, caves[1][1], new Door());
		caves[1][2].setConnection(CaveRoomPd8.SOUTH, caves[2][2], new Door());
		caves[1][2].setConnection(CaveRoomPd8.EAST, caves[1][3], new Door());
		inventory = new InventoryNockles();
		startExploring();

	}

	private static void startExploring() {

		while(true){
			print(inventory.getDescription());
			print(currentRoom.getDescription());
			print("What would you like to do?");
			String input = in.nextLine();
			act(input);
		}
		
	}
	
	private static void act(String input) {
		currentRoom.intepretAction(input);
		
	}

	public static void print(String s){
		System.out.println(s);
	}

}
