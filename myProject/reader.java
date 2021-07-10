package myProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input Name :");
		String name = reader.readLine();
		System.out.println( "Your name is : " +name );
		return ;
	}

}
