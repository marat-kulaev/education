package homework4.task4;

import java.util.Objects;

public class Student{

	public String name;
	public String group;
	public int course;
	public double gpa;

	public Student(String name, String group, int course, double gpa){

		this.name=name;
		this.group=group;
		this.course=course;
		this.gpa=gpa;

	}

	public int hashCode(){

		return Objects.hash(name,group,(Integer)course,(Double)gpa);

	}
	
	public boolean equals(Object o){

		Student s=(Student)o;
		return name.equals(s.name) && group.equals(s.group) && course==s.course && gpa==s.gpa;

	}

	public String toString(){

		return "Student ("+hashCode()+"):\n name="+name+";\n group="+group+";\n course="+course+";\n gpa="+gpa;

	}

}