package com.list_train.main;


	import java.util.Arrays;
	import java.util.Scanner;

	public class Train {
	    String destination;
	    int trainNumber;
	    String departureTime;

	    public Train(String destination, int trainNumber, String departureTime) {
	        this.destination = destination;
	        this.trainNumber = trainNumber;
	        this.departureTime = departureTime;
	    }

	    public void printTrainInfo() {
	        System.out.println("Destination: " + destination);
	        System.out.println("Train number: " + trainNumber);
	        System.out.println("Departure time: " + departureTime);
	    }

	    public static void sortByTrainNumber(Train[] trains) {
	        Arrays.sort(trains, (train1, train2) -> train1.trainNumber - train2.trainNumber);
	    }

	    public static void sortByDestinationAndDepartureTime(Train[] trains) {
	        Arrays.sort(trains, (train1, train2) -> {
	            if (train1.destination.equals(train2.destination)) {
	                return train1.departureTime.compareTo(train2.departureTime);
	            } else {
	                return train1.destination.compareTo(train2.destination);
	            }
	        });
	    }

	    public static void main(String[] args) {
	        Train[] trains = new Train[5];
	        trains[0] = new Train("Moscow", 123, "08:00");
	        trains[1] = new Train("Paris", 456, "09:30");
	        trains[2] = new Train("London", 789, "11:45");
	        trains[3] = new Train("Moscow", 234, "10:15");
	        trains[4] = new Train("London", 567, "12:00");

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a train number to get information: ");
	        int inputTrainNumber = scanner.nextInt();

	        for (Train train : trains) {
	            if (train.trainNumber == inputTrainNumber) {
	                train.printTrainInfo();
	                break;
	            }
	        }

	        System.out.println("\nTrains sorted by train number:");
	        sortByTrainNumber(trains);
	        for (Train train : trains) {
	            train.printTrainInfo();
	        }

	        System.out.println("\nTrains sorted by destination and departure time:");
	        sortByDestinationAndDepartureTime(trains);
	        for (Train train : trains) {
	            train.printTrainInfo();
	        }
	    }
	}



