package com.main;

import java.util.Scanner;

public class OnlineReservationSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Login Form
	        System.out.println("Welcome to Online Reservation System");
	        System.out.print("Enter your username: ");
	        String username = scanner.nextLine();
	        System.out.print("Enter your password: ");
	        String password = scanner.nextLine();

	        // Authentication logic
	        if (authenticate(username, password)) {
	            System.out.println("Login successful!");
	            // Proceed to reservation system
	            reservationSystem();
	        } else {
	            System.out.println("Invalid username or password. Please try again.");
	        }
	    }

	    // Authentication method
	    private static boolean authenticate(String username, String password) {
	        // You can implement your authentication logic here, e.g., check against a database
	        // For simplicity, let's use hardcoded values
	        return username.equals("admin") && password.equals("password");
	    }

	    // Reservation System
	    private static void reservationSystem() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("\nReservation System");
	        System.out.println("Please fill in the details:");

	        // User input for reservation
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter train number: ");
	        int trainNumber = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        System.out.print("Enter class type: ");
	        String classType = scanner.nextLine();
	        System.out.print("Enter date of journey (YYYY-MM-DD): ");
	        String dateOfJourney = scanner.nextLine();
	        System.out.print("From (place): ");
	        String from = scanner.nextLine();
	        System.out.print("To (destination): ");
	        String to = scanner.nextLine();

	        // Process reservation (You can save data to a database here)
	        System.out.println("\nReservation Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Train Number: " + trainNumber);
	        System.out.println("Class Type: " + classType);
	        System.out.println("Date of Journey: " + dateOfJourney);
	        System.out.println("From: " + from);
	        System.out.println("To: " + to);

	        // Cancellation Form
	        System.out.println("\nCancellation Form");
	        System.out.print("Enter your PNR number: ");
	        String pnr = scanner.nextLine();
	        System.out.println("Fetching details for PNR: " + pnr);
	        // Display details for the given PNR number
	        // Implement cancellation logic here
	        System.out.println("Cancellation successful!");
	    }
	}



