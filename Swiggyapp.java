import java.util.Scanner;
class Swiggyapp
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Hotel");
		System.out.println("-------------");
		System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen\n4.Appa Canteen");
		System.out.print("Enter a hotel number: ");
		int num = sc.nextInt();
		double price = 0;
		switch(num){
			case 1:
				System.out.println("Buhari");
			System.out.println("------------------------------");
			    System.out.println("1.Chicken Biriyani\n2.Button Biriyani\n3.Prawn Biriyani");

			    System.out.print("enter the dish needed: ");
				int buhari_item=sc.nextInt();
				switch(buhari_item){
					case 1:
						System.out.println("Chicken Biriyani");
					    price=200;
					    break;
					case 2:
						System.out.println("Button Biriyani");
					    price=280;
					    break;
					case 3:
						System.out.println("Prawn Biriyani");
					    price=330;
					    break;				
				}
				break;
				default:
						System.out.println("Dish not found , order any other above mentioned");
					    return;
		case 2:
			System.out.println("A2B");
		System.out.println("------------------------------");
			    System.out.println("1.Idly\n2.Dosa\n3.pongal");

			    System.out.print("enter the dish needed: ");
				int a2b_item=sc.nextInt();
				switch(a2b_item){
					case 1:
						System.out.println("Idly");
					    price=60;
					    break;
					case 2:
						System.out.println("Dosa");
					    price=180;
					    break;
					case 3:
						System.out.println("pongal");
					    price=120;
					    break;
					default:
						System.out.println("Dish not found , order any other above mentioned");
					    return;

				}
		 case 3:
			 System.out.println("Amma Canteen");
		 System.out.println("------------------------------");
			    System.out.println("1.Sambar\n2.Lemon Rice\n3.Curd Rice");

			    System.out.print("enter the dish needed: ");
				int Amma_item=sc.nextInt();
				switch(Amma_item){
					case 1:
						System.out.println("Sambar");
					    price=5;
					    break;
					case 2:
						System.out.println("Lemon Rice");
					    price=4;
					    break;
					case 3:
						System.out.println("Curd Rice");
					    price=3;
					    break;
					default:
						System.out.println("Dish not found , order any other above mentioned");
					    return;

				}
		case 4:
			 System.out.println("Appa Canteen");
		System.out.println("------------------------------");
			    System.out.println("1.Bajii\n2.Bonda\n3.Tea");

			    System.out.print("enter the dish needed: ");
				int Appa_item=sc.nextInt();
				switch(Appa_item){
					case 1:
						System.out.println("Bajii");
					    price=20;
					    break;
					case 2:
						System.out.println("Bonda");
					    price=10;
					    break;
					case 3:
						System.out.println("Tea");
					    price=15;
					    break;
					default:
						System.out.println("Dish not found , order any other above mentioned");
					    return;

				}
		
		}
		System.out.println("------------------------------");
		System.out.print("Enter a Quantity Needed: ");
		int Quantity=sc.nextInt();
		System.out.println("Processing please wait for a moment");
			Thread.sleep(3000);
			
		System.out.println("The Total Amount Is :  "+price*Quantity);
		//Thread.sleep(3000);
		//double total= price*Quantity;
		long reg_phone = 9876543210L;
System.out.print("Please Enter Your Number: ");
long user_phone = sc.nextLong();

if (reg_phone == user_phone) {
    System.out.println("Verifying Your Phone Number Please Wait........");
    Thread.sleep(3000);

    int otp = (int)(Math.random() * 9000) + 1000;
    System.out.println("\nEnter OTP: " + otp);

    System.out.print("Enter Here: ");
    int verify = sc.nextInt();

    if (otp == verify) {
        System.out.println("\nVerification and Validation is Successful");	
		System.out.println("Enter your Payment Method: ");
		System.out.println("----------------------------------------");
		System.out.println("1.Phonepay\n2.GPay\n");
		System.out.print("enter a payment method: ");
		int pay=sc.nextInt();
		switch(pay){
			case 1:
			{
				System.out.println("Connecting to Google Pay...");
			Thread.sleep(2000);
			System.out.println("Rs. " + (price*Quantity) + " Paid Successfully via GPay!");
			break;
		}
		case 2:
			{
				System.out.println("Connecting to Phone Pay...");
			Thread.sleep(2000);
			System.out.println("Rs. " + (price*Quantity) + " Paid Successfully via Phone Pay!");
			break;
		}

    } 

}
else {
        System.out.println("\nVerification and Validation is Failed");
    }


}	
		}

	}

