package fixtures;

import java.util.Arrays;

public class Room extends Fixture {
	Room[] exits;
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[2]; // size is your choice
	}
		
	public Room[] getExits() {
		return exits;
		
	}
		
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	public Room getExit(String direction) {
		return exits[0];
		
	}

	@Override
	public String toString() {
		return "Room [exits=" + Arrays.toString(exits) + "]";
	}

	
}
