package homework2.task1;

public class Sedan extends Car{

	private byte numberOfDoors;
	private int trunkCapacity;
	private String luxuryLevel;

	public Sedan(String fuelType, byte numberOfDoors, int trunkCapacity, String luxuryLevel){

		super(fuelType);
		this.numberOfDoors=numberOfDoors;
		this.trunkCapacity=trunkCapacity;
		this.luxuryLevel=luxuryLevel;

	}

	public byte getNumberOfDoors(){

		return numberOfDoors;

	}

	public int getTrunkCapacity(){

		return trunkCapacity;

	}

	public String getLuxuryLevel(){

		return luxuryLevel;

	}
	
}