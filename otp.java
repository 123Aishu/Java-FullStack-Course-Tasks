import java.util.Scanner;
class otp
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		long reg_ph=9876543210L;
		System.out.print("Enter Your Phone Number: ");
		long user_ph=sc.nextLong();
		if(reg_ph==user_ph){
			int otp = (int) (Math.random() * 90000) + 10000;
			System.out.println("Otp for Verification: "+otp);
			System.out.print("Enter Your OTP: ");
			int verify=sc.nextInt();
			if(otp==verify){
				System.out.println("Verification and Validation is Successfull");
			}
			else
			{
				System.out.println("Verification and Validation is Failed");
			}

		}
		else {
            System.out.println("Phone number does not match!");

	}
}
}