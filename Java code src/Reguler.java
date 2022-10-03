package _3oct;

class Reguler {
    int membership_fee=0;
    int enrollment_fee=0;
    
    int charges_per_month=20000;
    
    int months;
    
    public Reguler(int months) {
        super();
        this.months=months;
    }


  public void display() {
        System.out.println("Bill for regular member : ");
        System.out.println("Membership Fee : "+this.membership_fee);
        System.out.println("Enrollment Fee : "+this.enrollment_fee);
        System.out.println("Charges Per Month = Rs 20,000");
        System.out.println("*******************************");
        int charges = this.months*this.charges_per_month+this.membership_fee+this.enrollment_fee;
        System.out.println("Total amount : "+charges);
    }
    
    
}



/* Name : Gourav Soni*/