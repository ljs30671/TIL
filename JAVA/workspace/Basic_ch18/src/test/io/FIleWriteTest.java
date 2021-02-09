package test.io;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriteTest {
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
		fw = new FileWriter("c:\\temp\\b.txt");
		fw.write("lalala\n");
		fw.write("herfrfq");
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(fw != null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
