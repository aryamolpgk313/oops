package inheritance;

import java.util.Scanner;

public class Booking1{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int persons, total_Days;
		double tariff;
		String roomType;
		System.out.println("Booking");
		System.out.println("Enter the number of persons:");
		int p=s.nextInt();
		System.out.println("Enter the number of days:");
		int d=s.nextInt();
		System.out.println("Enter the room type(AC/Non AC):");
		String type=s.next();
		System.out.println("Enter the tariff for single person:");
		int ta=s.nextInt();

		SeasonBooking sb=new SeasonBooking();
		sb.roombooking(p, d, ta);

		}

		}
		class SeasonBooking extends Booking1{
		int p;
		int d;
		String type;
		int ta;
		void roombooking(int p,int d,int ta)
		{
		int set=d*ta*p;
		System.out.println("Total Tariff "+set+"/-");
	}
}
