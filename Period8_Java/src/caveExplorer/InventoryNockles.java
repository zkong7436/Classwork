package caveExplorer;

public class InventoryNockles {
	
	private boolean hasMap;
	private String map;

	public InventoryNockles() {
		hasMap = false;
		updateMap();
	}
	
	public void setHasMap(boolean hasMap) {
		this.hasMap = hasMap;
	}



	public void updateMap() {
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//convert these caves to a string representation
		map = " ";
		//horizontal line across top row with 4
		//except for last column
		for(int i=0; i<caves[i].length-1; i++){
			map+="____";
		}
		map+="___\n";
		//each room
		for(CaveRoomPd8[] row: caves){
			//there are three rows of text
			for(int textRow=0; textRow<3; textRow++){
				//the text is for each room
				for(CaveRoomPd8 cr: row){
					String str= "|   ";
					String contents = cr.getContents();
					if(textRow==1){
						if(cr.getDoor(CaveRoomPd8.WEST)!=null && cr.getDoor(CaveRoomPd8.WEST).isOpen()){
							str = "  " + contents + " ";
						}else{
						str = "| "+contents+" ";
						}
					}
					else if(textRow==2){
						if(cr.getDoor(CaveRoomPd8.SOUTH)!=null && cr.getDoor(CaveRoomPd8.SOUTH).isOpen()){
							str="|_ _";
						}else{
							str="|___";
						}
					}
					map+=str;			
				}
				map+="|\n";
			}
		}
		
	}

	public String getDescription() {
		if(hasMap) return map;
		else return "You have no inventory.";
		
	}

}
