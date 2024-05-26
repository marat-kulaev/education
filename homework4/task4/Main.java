package homework4.task4;

import java.util.List;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args){

		List<Student> als=new ArrayList<Student>();

		deleteLowGPAStudents(als);

		printStudents(als,5);

	}

	public static void deleteLowGPAStudents(List<Student> als){

		for(int i=0;i<als.size();i++){
			Student s=als.get(i);
			if(s.gpa>=3)s.course++;
			else{
				als.remove(s);
				i--;
			}
		}

	}

	public static void printStudents(List<Student> als, int course){

		for(int i=0;i<als.size();i++){
			Student s=als.get(i);
			if(s.course==course)
				System.out.println(s);
		}

	}

}