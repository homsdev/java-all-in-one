package com.homsdev.threads.sharedbankaccount;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RyanAndMonicaTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		RyanAndMonicaJob ryan = new RyanAndMonicaJob(account, "Ryan", 50);
		RyanAndMonicaJob monica = new RyanAndMonicaJob(account, "Monica", 100);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(ryan);
		executor.execute(monica);
		executor.shutdown();
	}
}
