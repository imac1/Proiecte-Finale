package Records;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataOutputStream out = null;
		try {
		
			out = new DataOutputStream(new FileOutputStream("fis.meu"));
		out.writeFloat((float) 10.0);
		out.writeInt(5);
		out.writeUTF("Hello");
		} catch(IOException e) {
		e.printStackTrace();
		} finally {
		if (out != null) {
		try {
		out.close();
		} catch (IOException e) {
		// error closing file: oh well...
		}
		}
		}
		DataInputStream in = null;
	
		try {
		in = new DataInputStream(new FileInputStream("fis.meu"));
		System.out.println("Citesc un float: " + in.readFloat());
		System.out.println("Citesc un int: " + in.readInt());
		System.out.println("Citesc un string: " + in.readUTF());
		} catch(IOException e) {
		e.printStackTrace();
		} finally {
		if (in != null) {
		try {
		in.close();
		} catch (IOException e) {
		// error closing file: oh well...
		}
		}
		}
		}
		
	}


