package MakeChange;

import java.util.Scanner;

public class MakeChangeProject {

	static double total = 1, tender, change;

	static final int twentybill = 20, tenbill = 10, fivebill = 5, onebill = 1, quarters = 25, dimes = 10, nickels = 5,
			pennies = 1;

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Cash Register v3.1. \n\nPlease enter type 000 at any time to quit\n");

		while (total != 000) {

			CashRegister();

		}
	}

	public static void CashRegister() {

		System.out.println("How much was the total?");

		total = input.nextDouble();

		if (total == 000) {

			return;
		}

		System.out.println("How much is being tendered?");

		tender = input.nextDouble();
		if (tender == 000) {

			return;
		}

		while (tender < total) {

			System.out.println("That is not enough money.  Please equal or exceed the total now");

			tender = input.nextDouble();
		}
		change = tender - total;
		if (tender == total) {

			System.out.println("No change is required. Amounted tendered = Total Due.");

		}

		else {

			Dollars(twentybill, "twenties");
			Dollars(tenbill, "tens");
			Dollars(fivebill, "fives");
			Dollars(onebill, "ones");

			change = (change * 100) + (.5);
			Cents(quarters, "quarters");
			Cents(dimes, "dimes");
			Cents(nickels, "nickels");
			Cents(pennies, "pennies");

		}

	}

	public static void Dollars(int DollarType, String DollarName) {

		if (change >= DollarType) {
			if (change >= DollarType && change % DollarType >= 0) {
				int bills = (int) (change / DollarType);
				change %= DollarType;

				System.out.println(bills + " " + DollarName);
			}

		}

	}

	public static void Cents(int CoinType, String CoinName) {

		if (change >= CoinType) {
			if (change >= CoinType && change % CoinType >= 0) {
				int coins = (int) (change / CoinType);
				change = change % CoinType;
				System.out.println(coins + " " + CoinName);
			}

		}
	}

}
