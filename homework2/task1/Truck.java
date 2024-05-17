package homework2.task1;

public class Truck extends Car{

	private byte numberOfDoors;
	private int trunkCapacity;
	private int maxLoadCapacity;

	public Truck(String fuelType, byte numberOfDoors, int trunkCapacity, int maxLoadCapacity){

		super(fuelType);
		this.numberOfDoors=numberOfDoors;
		this.trunkCapacity=trunkCapacity;
		this.maxLoadCapacity=maxLoadCapacity;

	}

	public byte getNumberOfDoors(){

		return numberOfDoors;

	}

	public int getTrunkCapacity(){

		return trunkCapacity;

	}

	public int getMaxLoadCapacity(){

		return maxLoadCapacity;

	}
	
}