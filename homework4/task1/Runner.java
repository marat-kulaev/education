package homework4.task1;

import java.util.List;
import java.util.ArrayList;

public class Runner{
	
	public static void main(String[] args){

		ArrayList<String> countriesList=new ArrayList<String>(); // 1.1

		countriesList.add("Russia"); // 1.2
		countriesList.add("Ukraine");
		countriesList.add("Belarus");
		System.out.println(countriesList);

		countriesList.set(1,"Kazakhstan"); // 1.3

		countriesList.remove(1); // 1.4

		countriesList.remove("Russia"); // 1.5

		countriesList.indexOf("Belarus"); // 1.6

		// 1.7 ???

	}

}