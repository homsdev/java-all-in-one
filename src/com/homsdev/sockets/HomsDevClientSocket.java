package com.homsdev.sockets;

import java.io.DataOutputStream;
import java.net.Socket;

public class HomsDevClientSocket {

	public static void main(String[] args) {
		try (Socket client = new Socket("localhost", 8090);
				DataOutputStream outputStream = new DataOutputStream(client.getOutputStream())) {
		
			outputStream.writeUTF("Hey I'm a client");
			outputStream.writeUTF("exit");
		} catch (Exception e) {

		}
	}
}
