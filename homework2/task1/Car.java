package homework2.task1;

abstract public class Car implements Vehicle{

	public boolean on;
	private String fuelType;

	public Car(String fuelType){

		this.fuelType=fuelType;

	}

	public void start(){

		on=true;
		
	}

	public void stop(){

		on=false;
		
	}

	public String getFuelType(){

		return fuelType;

	}

	abstract public byte getNumberOfDoors();
	
	abstract public int getTrunkCapacity();
	
}