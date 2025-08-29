package demo.learn.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
	public static void main(String[] args) {
		//InputStreamReader in = new InputStreamReader(System.in);
		
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter the number");
			int num=Integer.parseInt(br.readLine());
			System.out.println("Entered number is : "+num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
