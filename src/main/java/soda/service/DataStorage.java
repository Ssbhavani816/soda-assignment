package soda.service;

import java.io.FileWriter;
import java.io.IOException;

public class DataStorage {
	public static void storePurchase(String purchaseInfo) {
		// Simulating storing purchase information to a file
		try (FileWriter writer = new FileWriter("purchases.txt", true)) {
			writer.write(purchaseInfo + "\n");
		} catch (IOException e) {
			System.err.println("Error storing purchase: " + e.getMessage());
		}
	}
}


