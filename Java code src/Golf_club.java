package _3oct;
import java.util.*;
public class Golf_club {
	public static void main(String[] args) {
		System.out.println("Enter Details for enrollment");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the membership type:");
		System.out.println("1. Regular \n2. Gold \n3. Silver");
		int memebership_type=sc.nextInt();
		System.out.println("enter the number of months you want to enroll yourself : ");
		int months=sc.nextInt();

		Reguler mb ;

		switch (memebership_type) {

		case 1:
			mb= new Reguler(months);
			mb.display();
			break;

		case 2:
			mb = new Gold(months);
			mb.display();
			break;

		case 3:
			mb = new Silver(months);
			mb.display();
			break;

		default:
			System.out.println("choose one out of regular/gold/silver");
			break;
		}
		sc.close();

	}
}

/* Name : Gourav Soni*/