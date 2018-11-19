package com.qa.Examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException
	{
		FileHandling fileHandling = new FileHandling();
		fileHandling.intro();
	}

	void intro() throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader ("C:/users/Admin/Desktop/errors.txt"));
		
		String line;
		String allLines = "";
		while ((line = in.readLine()) != null )
		{
			allLines += line +"\r\n";
		}
		in.close();
		
		BufferedWriter out = new BufferedWriter(new FileWriter("C:/users/Admin/Desktop/errors.txt"));
		System.out.println(allLines + "new line");
		
		out.write(allLines + "new line");
		out.close();
	}
	
}