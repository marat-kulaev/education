package homework3.task4;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Runner{
	
	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb=new StringBuilder(br.readLine());
		for(int i=sb.length()-1;i>=0;i--)
			sb.insert(i,sb.charAt(i));

		System.out.println("\nDuplicated string \""+sb+"\"\n");

	}

}