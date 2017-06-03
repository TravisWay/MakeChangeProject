package MakeChange;

import java.util.Scanner;

public class MakeChangeProject {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How much was the total?");

		double total = input.nextDouble();

		System.out.println("How much was tendered?");

		double tender = input.nextDouble();

		while (total > tender) {

			System.out.println("You did not give enough money");

			System.out.println("Please give me more money");

			tender = input.nextDouble();

		}

		double change = tender - total;

		int quarters, dimes, nickels, pennnies;

		if (change >= 1) {
			if (change % 20 >= 0) {
				int twenties = (int) (change / 20);
				change = change % 25;
				System.out.println(twenties + " twenty dollar bills");

			}

			if (change % 10 >= 0) {
				int tens = (int) (change / 10);
				change = change % 10;
				System.out.println(tens + " ten dollar bills");
			}

			if (change % 2 >= 0) {
				int twos = (int) change / 2;
				change = change % 2;
				System.out.println(twos + " Two dollar bills...Yes, this is two dollar bils");
			}
			if (change % 1 >= 0) {
				int ones = (int) change / 1;
				change = change % 1;
				System.out.println(ones + " one dollar bils");
			}

		}

		change = change * 100;

		if (change < 1000) {

			if (change % 25 >= 0) {
				quarters = (int) (change / 25);
				change = change % 25;
				System.out.println(quarters + " quarters");

			}

			if (change % 10 >= 0) {
				dimes = (int) (change / 10);
				change = change % 10;
				System.out.println(dimes + " dimes");
			}

			if (change % 5 >= 0) {
				nickels = (int) change / 5;
				change = change % 5;
				System.out.println(nickels + " nickels");
			}
			if (change % 1 >= 0) {
				pennnies = (int) change / 1;
				change = change % 1;
				System.out.println(pennnies + " pennies");
			}

		}

	}

}
