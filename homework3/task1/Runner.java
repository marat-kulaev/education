package homework3.task1;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Runner{
	
	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String[] s_=new String[3];
		for(int i=0;i<s_.length;i++)
			s_[i]=br.readLine();

		int is=0;
		int il=0;
		for(int i=1;i<s_.length;i++){

			if(s_[i].length()<s_[is].length())is=i;
			if(s_[i].length()>s_[il].length())il=i;

		}

		System.out.println("\nNoticeable strings:");
		System.out.println(" shortest \""+s_[is]+"\" ("+s_[is].length()+" chars)");
		System.out.println(" longest \""+s_[il]+"\" ("+s_[il].length()+" chars)\n");

	}

}