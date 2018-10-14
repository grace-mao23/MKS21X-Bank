public class Driver{
	public static void main(String[]args){
		BankAccount a = new BankAccount(100.0, 24225, "password");

		System.out.println("Your balance is $" + a.getBalance());
		//should print "Your balance is $100.0"

		System.out.println("Your Acccount ID is " + a.getAccountID());
		//should print "Your Account ID is 24225"

		a.setPassword("kittenswithmittens");

		System.out.println(a);
		//should print "24225 100.0"

		a.deposit(50.0);

		System.out.println(a);
		//should print "24225 150.0"

		a.deposit(-40.0);

    System.out.println(a);

		a.withdraw(50.0);

    System.out.println(a);
    //should print "24225 100.0"

		a.withdraw(200.0);

    System.out.println(a);
	}
}
