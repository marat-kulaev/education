package homework4.task2;

import java.util.LinkedList;

public class Runner{
	
	public static void main(String[] args){

		LinkedList<String> countriesList=new LinkedList<String>(); // 2.1

		countriesList.addFirst("Belarus"); // 2.2
		countriesList.addFirst("Russia");
		countriesList.addLast("Ukraine");
		countriesList.addLast("Kazakhstan");
		System.out.println(countriesList);

		countriesList.removeFirst(); // 2.3
		countriesList.removeLast();

		countriesList.getFirst(); // 2.4
		countriesList.getLast(); 

	}

}