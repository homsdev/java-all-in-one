package com.homsdev.sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HomsDevServerSocket {
	public static void main(String[] args) throws IOException {

		try (ServerSocket socket = new ServerSocket(8090);
				Socket client = socket.accept();
				DataInputStream inputStream = new DataInputStream(client.getInputStream())) {
			System.out.println("Listening to request");
			System.out.printf("Connected Client: %s\n", client.getInetAddress().getHostName());
			String msg = null;
			do {
				msg = inputStream.readUTF();
				System.out.printf("%s says: %s\n", client.getInetAddress().getHostName(), msg);
			} while (!"exit".equals(msg));
			System.out.println("Closing connection");
		} catch (Exception e) {

		}
	}
}
