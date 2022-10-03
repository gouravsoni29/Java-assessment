package _3oct;
import java.util.*;
public class MemberType {

	int age;
	String name;
	int memberType;
	String memberTypes;
	String tripname;
	int idno;
	String phoneno,address;
	int tno;
	static int countCrew,countAdult,countChild;
	int fee;

	Scanner sc = new Scanner(System.in);

	public MemberType() 
	{
		System.out.println("Enter Your Age");
		this.age=sc.nextInt();
		System.out.println("Enter Your Name");
		this.name=sc.next();

		if(age>10) {

			System.out.println("Type 1 for Crew Member or 2 for Adults");

			this.memberType=sc.nextInt();

			if(memberType==1) 
			{
				System.out.println("Enter id no.");
				this.idno=sc.nextInt();
				System.out.println("Enter trip name");
				this.tripname=sc.next();
				this.memberTypes="Crew";
				countCrew++;
				fee=0;
			}
			else if(memberType==2) 
			{
				System.out.println("Enter the ticket number");
				this.tno=sc.nextInt();
				System.out.println("Enter phone number");
				this.phoneno=sc.next();
				System.out.println("Enter address");
				this.address=sc.next();
				this.memberTypes="Adult";
				countAdult++;
				fee=500;
			}
		}
		else 
		{
			System.out.println("Enter ticket number");
			this.tno=sc.nextInt();
			this.memberTypes="Children";
			countChild++;
			fee=250;
		}
	}
	public static String countMembers() {

		return "Number of Crew Members: "+countCrew+"\nNumber of Adults: "+countAdult+"\nNumber of Children: "+countChild;
	}   
	public static String total()
	{
		return "Total amount of ticket sold = "+(countAdult+countChild+countCrew);
	}
}
/* Name : Gourav Soni*/