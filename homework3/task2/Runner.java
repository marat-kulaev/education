package homework3.task2;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Runner{

	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String[] s_=new String[3];
		for(int i=0;i<s_.length;i++)
			s_[i]=br.readLine();

		System.out.println("\nStrings that are lesser than the middle one:");
		for(int i=0;i<s_.length;i++)
			if(s_[i].length()<s_[1].length())
				System.out.println(" \""+s_[i]+"\" ("+s_[i].length()+" chars)");
		System.out.println();

	}

}