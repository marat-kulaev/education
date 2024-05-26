package homework3.task3;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Runner{

	public static void main(String[] args) throws Exception{ // ???

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String[] s_=new String[3];
		for(int i=0;i<s_.length;i++)
			s_[i]=br.readLine();

		System.out.println();

		for(String s:s_){

			wc:for(String w:s.split(" ")){

				char[] c_=w.toCharArray();
				for(int i=0;i<c_.length-1;i++)
					for(int j=i+1;j<c_.length;j++)
						if(c_[i]==c_[j])
							continue wc;

				System.out.println("\""+s+"\":\n '"+w+"'");
				break;

			}

		}

		System.out.println();

	}

}