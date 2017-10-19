package io;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;

public class basicFileIO {

	public static void main(String[] args) throws IOException  
	{

		File path = new File("hello.txt");

		System.out.println(path);
		System.out.println(path.exists());
		System.out.println("We have a file " + path);
		System.out.println("What "+ path.isDirectory());

		String contents = "hello world";
		
		OutputStream outStream = new FileOutputStream(path);
		
			outStream.write(contents.getBytes());
	
		outStream.close();
	}
}
