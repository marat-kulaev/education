package homework2.task3;

public class Runner{

	public static void main(String[] args){

		System.out.println("Computer:");

		Computer.Processor processor=new Computer.Processor("Intel Core i7 9700KF");
		System.out.println(" processor - "+processor.getDetails());

		Computer computer=new Computer();
		Computer.RAM ram=computer.new RAM("16 GB");
		System.out.println(" RAM - "+ram.getDetails());

	}

}