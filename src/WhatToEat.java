import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring variables

		String eventType;
		int partySize;
		String result;
		Scanner scnr = new Scanner(System.in);
		String resultEvent = "  ";
		String resultPrep = " ";
		char typeEv;
		String mealSuggest = " ";

		// Getting input from user

		System.out.println("Welcome to Plan your Party");
		System.out.println("How big is your party (# of guests)?");

		partySize = scnr.nextInt();

		System.out.println("What kind of event are you hosting?");
		System.out.println("Casual, Semi-formal or Formal?");

		eventType = scnr.next();
		typeEv = eventType.charAt(0);

		if ((typeEv == 'c') || (typeEv == 'C')) {
			resultEvent = "casual";
			mealSuggest = "sandwiches";
			if (partySize == 1) {
				resultPrep = "in the microwave";
			} else if ((partySize >= 2) && (partySize < 12)) {
				resultPrep = "in your kitchen";
			} else {
				resultPrep = "by a caterer";
			}
		}

		if ((typeEv == 's') || (typeEv == 'S')) {
			resultEvent = "semi-formal";
			mealSuggest = "fried chicken";
			if (partySize == 1) {
				resultPrep = "in the microwave";
			} else if ((partySize >= 2) && (partySize < 12)) {
				resultPrep = "in your kitchen";
			} else {
				resultPrep = "by a caterer";
			}
		}
		if ((typeEv == 'f') || (typeEv == 'F')) {
			resultEvent = "formal";
			mealSuggest = "chicken parmesan";
			if (partySize == 1) {
				resultPrep = "in the microwave";
			} else if ((partySize >= 2) && (partySize < 12)) {
				resultPrep = "in your kitchen";
			} else {
				resultPrep = "by a caterer";
			}
		}
		// Printing results according to event

		result = "Since you are hosting a ";
		result = result.concat(resultEvent);
		System.out.println(result + " event for " + partySize + " participant(s),");
		System.out.print("you should serve " + mealSuggest + " prepared " + resultPrep + ".");

	}

}
