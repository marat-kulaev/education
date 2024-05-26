package homework4.task3;

import java.util.Objects;

public class Person{

	final private String name;
	final private int age;

	public Person(String name, int age){

		this.name=name;
		this.age=age;

	}

	public int hashCode(){

		return Objects.hash(name,(Integer)age);

	}
	
	public boolean equals(Object o){

		Person p=(Person)o;
		return name.equals(p.name) && age==p.age;

	}

	public String toString(){

		return "Person ("+hashCode()+"):\n name="+name+";\n age="+age+".";

	}

}