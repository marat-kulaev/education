package homework2.task3;

public class Computer{

	public static class Processor{

		private String model;

		public Processor(String model){

			this.model=model;

		}

		public String getDetails(){

			return model;

		}

	}

	public class RAM{

		private String size;

		public RAM(String size){

			this.size=size;

		}

		public String getDetails(){

			return size;

		}

	}

}