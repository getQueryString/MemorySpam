package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class main extends Thread {

	static ArrayList<String> SPAMLOL = new ArrayList<>();

	public static void main(String[] args) {
		
		SPAMLOL.add("SPAM");
		new main().start();
		new main().run();

	}

	@Override
	public void run() {
		while (true) {
			String tf = "dd.MM.yyyy HH-mm-ss-SS";
			DateTimeFormatter fm = DateTimeFormatter.ofPattern(tf);
			LocalDateTime dT = LocalDateTime.now();
			String dTime = dT.format(fm);
			SPAMLOL.add("SPAM");
			System.out.println(dTime);
			new main().start();
			new main().run();
		}

	}
}
