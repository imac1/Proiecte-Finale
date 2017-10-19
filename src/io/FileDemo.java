package io;
import java.io.*;


class FileDemo 
{
public static void main(String args[])throws IOException
{
	
	// reading info from one file to another, automatcally
	 String fileInput = "L2.txt";
     String fileoutput = "fisier.txt";
     
   
         FileReader fr = new FileReader(fileInput);
         FileWriter fw = new FileWriter(fileoutput);

         int character;
         while((character=fr.read())!=-1) {
             fw.write(character);
         } 
         fr.close();
         fw.close();

     } 
 
     
  }
