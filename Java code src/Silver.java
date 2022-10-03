package _3oct;

class Silver extends Reguler{


	int membership_fee=15000;
	int enrollment_fee=5000;
	int charges_per_month=20000;
	public Silver(int months) {
		super(months);
		// TODO Auto-generated constructor stub
	}

	
	public void display() {
		
		System.out.println("Bill for Silver member : ");
		System.out.println("Membership Fee : "+this.membership_fee);
		System.out.println("Enrollment Fee : "+this.enrollment_fee);
		System.out.println("Charges for 6 Month : Free");
		System.out.println("after 6 months charges per month : 20000");
		System.out.println();
		System.out.println("*****************************");

		if(months<=6) {
			int charges=this.membership_fee+this.enrollment_fee;
			System.out.println("Total amount : "+charges);
		}

		if(months>6)
		{
			int charges=this.membership_fee+this.enrollment_fee+((this.months-6)*this.charges_per_month);
			System.out.println("Total amount : "+charges);
		}
	}
}

/* Name : Gourav Soni*/