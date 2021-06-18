package game;

import fixtures.Room;

public class RoomManager {
	
	Room[] rooms;
	Room startingRoom;
	

	public void init() {
	    Room foyer = new Room(
			"Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room and kitchen is open to the SOUTH, where a large table can be seen." + "\n"
			+ "The hardwood floor leads WEST into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the NORTH is a living room, where you can see a piano." + "\n"
			+ "Foyer is the one of the correct way exiting my house."+"\n"
			+ "NO ROOM OPEN T0 THE EAST");
			this.rooms[0] = foyer;
	        this.startingRoom = foyer;
	        
	        Room livingRoom = new Room("Living Room",
	        		"a large living room",
	        		"Living room is very bright and the floor is rug, the east of living room is a larger window that you can exit from (type quit)." + "\n"
	        		+ "The south of living room has a large sofa for people to relax and sofa can change to a bed." + "\n"
	        		+ "The north of living room has a TV and piano."+ "\n"
	        		+ "Kitchen and dinning room is open to the SOUTH where a sink can be seen." + "\n"
	        		+ "restroom and Lanundry room is open to the WEST."+ "\n"
	        		+ "foyer is open to the EAST where you can exit correctly."+"\n"
	        		+ "NO ROOM OPEN TO THE NORTH");
	        this.rooms[1] = livingRoom;
	        
	        Room restRoom = new Room("restroom and Lanundry Room", 
	        		"a large lanundry room that has restroom", 
	        		"This room has washing machine and drying machine and they are next to each other." + "\n"
	        		+"The north of drying machine is toliet and sink is right next to the toliet." + "\n"
	        		+ "The east of this room is where window is that you can exit from (type quit)."  + "\n"
	        		+ "The living room is open to the EAST."
	        		+ "NO ROOM IS OPEN TO THE NORH, WEST, AND SOUTH");
	        this.rooms[2] = restRoom;
	        
	        Room kitchen = new Room("Kitchen and Dinning room", 
	        		"a large kitchen and dinning room",
	        		"Kitchen is open to the east of the room, when you wash dish you can also watch the TV from the living room." + "\n"
	        		+ "Electric Ranges is open to south of the sink, and microwave is locate right above the ranges that has air exhaust with it." + "\n"
	        		+ "Refractor is located it right next to the ranges(west), and keep going west is where a large table is where you dining." + "\n"
	        		+ "A large table has 6 chairs around it, the south of table has a large window." + "\n"
	        		+ "Staircase is open to the WEST of this room that leads to second floor." + "\n"
	        		+ "Foyer is open to the EAST of this room where you can exit correctly"+"\n"
	    			+ "Kitchen is the one of the correct way exiting my house too."+"\n"
	        		+ "NO ROOM IS OPEN TO THE SOUTH");
	        this.rooms[3] = kitchen;
	        
	        Room stair = new Room("staircase to the second floor", 
	        		"the staircase has rug", 
	        		"You walk up the staircase, the biggest room of this house is open to the WEST that is right next to staircase."+ "\n"
	        		+ "Bathroom is open to the NORTH." + "\n"
	        		+ "Another room is open to the EAST when you walk down the hallway." + "\n"
	        		+ "Window is locate in the halfway on the wall of the staircase, you can jump off the window to exit by typing quit." +"\n"
	        		+ "SOUTH COMMAND WILL BACK TO THE FIRST FLOOR");
	        this.rooms[4] = stair;
	        
	        Room Room1 = new Room("biggest bedroom",
	        		"The biggest bedroom of the house", 
	        		"The room that has king size bed. "+ "\n"
	        		+ "Desktop computer is locate in on the east of the bed."+ "\n"
	        		+ "Bathroom is open to the EAST of the room when you walk down the hallway." +"\n"
	        		+ "To exit from this room, type quit to jump off the window that is on to the west of the room."+"\n"
	        		+ "NO ROOM IS OPEN TO THE NORTH, SOUTH, AND WEST");
	        this.rooms[5] = Room1;
	        
	        Room Room2 = new Room("bedroom", 
	        		"A medium size bedroom",
	        		"The room that has queen size bed." + "\n"
	        		+ "Cornor desk is locate it in north east of the room." +"\n"
	        		+ "Bathroom is open to the WEST of the room when you walk down the hallway." +"\n"
	        		+ "To exit from this room, jump off the window that is on to the east of the room." +"\n"
	        		+ "NO ROOM IS OPEN TO THE NORTH, SOUTH, AND EAST");
	        this.rooms[6] = Room2;
	        
	        Room bathroom = new Room("bathroom", 
	        		"A bathroom that has sink, bathtub, and toilet", 
	        		"The north of this room where the bathtub is." + "\n"
	        		+ "Toilet is on the west of the room, above the toilet is the window."
	        		+ "In front of the toilet is where the sink is." + "\n"
	        		+ "Staircse to the first floor is open to the SOUTH" +"\n"
	        		+ "EAST is the biggest bedroom and WEST is the another bedroom"+"\n"
	        		+ "To exit, type quit to jump off the window that is above the toilet." + "\n"
	        		+ "Friendly offer: Outside of the window is backyards that has a pool."+"\n"
	        		+ "NO ROOM IS OPEN TO THE NORTH");
	        this.rooms[7] = bathroom;
	        
	        Room stair2 = new Room("staircase to first floor", 
	        		"the staircase has rug", 
	        		"You walk down the staircase, your back to the first floor"+ "\n"
	        		+ "Window is locate in the halfway on the wall of the staircase, you can jump off the window to exit by typing quit" + "\n"
	        		+ "Kitchen and dinning room is open to the EAST where a large table can be seen and is one of the correct exit."+"\n"
	        		+ "NO ROOM IS OPEN TO THE WEST AND SOUTH" +"\n"
	        		+ "COMMAND NORTH WILL BACK TO THE SECOND FLOOR");
	        this.rooms[8] = stair2;
	        
			Room[] foyerExits = {livingRoom, kitchen, foyer, stair};
			foyer.setExits(foyerExits);
			
			Room[] livingRoomExits  = {livingRoom, kitchen, foyer, restRoom};
			livingRoom.setExits(livingRoomExits);
			
			Room[] restRoomExits  = {restRoom, restRoom, livingRoom, restRoom};
			restRoom.setExits(restRoomExits);
	        
			Room[] kitchenExits  = {livingRoom, kitchen, foyer, stair};
			kitchen.setExits(kitchenExits);
			
			Room[] stairExits  = {bathroom, stair2, Room2, Room1};
			stair.setExits(stairExits);
			
			Room[] Room1Exits  = {Room1, Room1, bathroom, Room1};
			Room1.setExits(Room1Exits);
			
			Room[] Room2Exits  = {Room2, Room2, Room2, bathroom};
			Room2.setExits(Room2Exits);
			
			Room[] bathroomExits  = {bathroom, stair2, Room2, Room1};
			bathroom.setExits(bathroomExits);
			
			Room[] stair2Exits  = {stair, stair2, kitchen, stair2};
			stair2.setExits(stair2Exits);
	}


	public Room[] getRooms() {
		return rooms;
	}


	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}


	public Room getStartingRoom() {
		return startingRoom;
	}


	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public RoomManager(int index) {
		this.rooms = new Room[index];
	}
	
}
