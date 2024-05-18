package homework2.task2;

import java.util.List;

public class ImmutablePerson{

	final String name;
	final int age;
	final List<String> hobbies;

	ImmutablePerson(String name, int age, List<String> hobbies){

		this.name=name;
		this.age=age;
		this.hobbies=hobbies;

	}

}