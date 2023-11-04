package com.homsdev.sockets;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServerWorker extends Thread {

	private Socket socket;

	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try (DataInputStream inputStream = new DataInputStream(socket.getInputStream())) {

			String msg = null;

			do {
				msg = inputStream.readUTF();
				System.out.printf("%s says: %s\n", socket.getInetAddress().getHostName(), msg);
			} while (!"exit".equals(msg));

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}

public class ServerSocketMultiClient {

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(8090);) {
			while (true) {
				ServerWorker serverWorker = new ServerWorker(serverSocket.accept());
				serverWorker.start();
			}
		} catch (Exception e) {

		}
	}
}
