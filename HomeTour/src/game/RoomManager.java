package game;

import fixtures.Room;

public class RoomManager {
	
	Room[] rooms;
	Room startingRoom;
	

	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
			this.rooms[0] = foyer;
	        this.startingRoom = foyer;
	        
	        Room livingRoom = new Room("livingRoom", null, null);
	        this.rooms[1] = livingRoom;
	        
	        Room FBathroom = new Room("First floor bathroom", null, null);
	        this.rooms[2] = FBathroom;
	        
	        Room kitchen = new Room("kitchen", null, null);
	        this.rooms[3] = kitchen;
	        
	        Room stair = new Room("stair", null, null);
	        this.rooms[4] = stair;
	        
	        Room Room1 = new Room("Room1", null, null);
	        this.rooms[5] = Room1;
	        
	        Room Room2 = new Room("Room2", null, null);
	        this.rooms[6] = Room2;
	        
	        Room SBathroom = new Room("Second floor bathroom", null, null);
	        this.rooms[7] = SBathroom;
	        
			
			
	        
	        
	}

}
