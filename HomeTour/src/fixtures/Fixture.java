package fixtures;

public class Fixture {
	String name;
	String shortDescription;
	String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public String toString() {
		return "Fixture [name=" + name + ", shortDescription=" + shortDescription + ", longDescription="
				+ longDescription + "]";
	}


	
}

