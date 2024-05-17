package homework2.task1;

public class Runner{
	
	public static void main(String[] args){

		Sedan sedan;
		Truck truck;
		Car car;
		Vehicle vehicle;

		sedan=new Sedan("electric",(byte)4,400,"XSE");
		System.out.println("Sedan:");
		System.out.println(" is on - "+sedan.on);
		System.out.println(" fuel type - "+sedan.getFuelType());
		System.out.println(" number of doors - "+sedan.getNumberOfDoors());
		System.out.println(" trunk capacity - "+sedan.getTrunkCapacity());
		System.out.println(" luxury level - "+sedan.getLuxuryLevel());

		sedan.start();
		System.out.println("  *started*... (is on - "+sedan.on+")");
		sedan.stop();
		System.out.println("  *stopped*... (is on - "+sedan.on+")");
		System.out.println();

		truck=new Truck("diesel",(byte)2,8200,13000);
		System.out.println("Truck:");
		System.out.println(" is on - "+truck.on);
		System.out.println(" fuel type - "+truck.getFuelType());
		System.out.println(" number of doors - "+truck.getNumberOfDoors());
		System.out.println(" trunk capacity - "+truck.getTrunkCapacity());
		System.out.println(" max load capacity - "+truck.getMaxLoadCapacity());

		truck.start();
		System.out.println("  *started*... (is on - "+truck.on+")");
		truck.stop();
		System.out.println("  *stopped*... (is on - "+truck.on+")"+")");
		System.out.println();

		car=sedan;
		System.out.println("Sedan (as Car):");
		System.out.println(" is on - "+car.on);
		System.out.println(" fuel type - "+car.getFuelType());
		System.out.println(" number of doors - "+car.getNumberOfDoors());
		System.out.println(" trunk capacity - "+car.getTrunkCapacity());

		car.start();
		System.out.println("  *started*... (is on - "+car.on+")");
		car.stop();
		System.out.println("  *stopped*... (is on - "+car.on+")");
		System.out.println();

		car=truck;
		System.out.println("Truck (as Car):");
		System.out.println(" is on - "+car.on);
		System.out.println(" fuel type - "+car.getFuelType());
		System.out.println(" number of doors - "+car.getNumberOfDoors());
		System.out.println(" trunk capacity - "+car.getTrunkCapacity());

		car.start();
		System.out.println("  *started*... (is on - "+car.on+")");
		car.stop();
		System.out.println("  *stopped*... (is on - "+car.on+")");
		System.out.println();

		vehicle=sedan;
		System.out.println("Sedan (as Vehicle):");
		System.out.println(" fuel type - "+vehicle.getFuelType());

		vehicle.start();
		System.out.println("  *started*... (is on - "+sedan.on+")");
		vehicle.stop();
		System.out.println("  *stopped*... (is on - "+sedan.on+")");
		System.out.println();

		vehicle=truck;
		System.out.println("Truck (as Vehicle):");
		System.out.println(" fuel type - "+vehicle.getFuelType());

		vehicle.start();
		System.out.println("  *started*... (is on - "+truck.on+")");
		vehicle.stop();
		System.out.println("  *stopped*... (is on - "+truck.on+")");
		System.out.println();

	}

}