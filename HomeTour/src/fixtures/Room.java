package fixtures;

import java.util.Arrays;

public class Room extends Fixture {
	Room[] exits;
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[3]; // size is your choice
	}
		
	public Room[] getExits() {
		return exits;
		
	}
		
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	public Room getExit(String direction) {
		if(direction.equals("north")) {
			 return exits[0];
		} else if (direction.equals("south")) {
			 return exits[1];
		} else if (direction.equals("east")) {
			return exits[2];
		} else if(direction.equals("west")){
			 return exits[3];
		}else {
			return null;
		}
		
	}

	@Override
	public String toString() {
		return "Room [exits=" + Arrays.toString(exits) + "]";
	}
}
