package homework2.task2;

import java.util.Arrays;
import java.util.ArrayList;

public class Runner{
	
	public static void main(String[] args){

		MutablePerson mutablePerson=new MutablePerson("Alex",16,new ArrayList<String>(Arrays.asList("golf","fishing","chess")));
		mutablePerson.name="Steve";
		mutablePerson.age=17;
		mutablePerson.hobbies=Arrays.asList("football","swimming","sculpting");

		ImmutablePerson immutablePerson=new ImmutablePerson("Lisa",15,Arrays.asList("drawing","dancing","cooking"));
		//immutablePerson.name="Helen"; // unchangeable (final) variable
		//immutablePerson.age=16; // unchangeable (final) variable
		//immutablePerson.hobbies=Arrays.asList("travelling","volleyball","fashion"); // unchangeable variable (final)
		//immutablePerson.hobbies.add("tennis"); // object of our variable `hobbies` is unchangeable too due it is type of List itself (so we don't need to use Collections.unmodifiableList(...))

	}

}