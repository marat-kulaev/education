package homework4.task3;

import java.util.HashSet;

public class Main{
	
	public static void main(String[] args){

		HashSet<Person> hs=new HashSet<Person>();

		hs.add(new Person("Danil",17));
		hs.add(new Person("Nikita",27));
		hs.add(new Person("Katya",37));
		for(Person p:hs)
			System.out.println(p);

		hs.remove(new Person("Danil",17));
		hs.remove(new Person("Katya",37));

		System.out.println(hs.contains(new Person("Nikita",27)));

	}

}