package server;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		
		try {
			
			ServerSocket ss = new ServerSocket(1234);
			Socket s=ss.accept();
			System.out.println(s.getInetAddress()+"connect success");
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			String msg=in.readUTF();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
