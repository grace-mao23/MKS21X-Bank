public class BankAccount{
  // instance variables
  private double balance;
  private int accountID;
  private String password;

  // constructor
  public BankAccount(double newBalance, int newAccountID, String newPassword){
    balance = newBalance;
    accountID = newAccountID;
    password = newPassword;
  }

  // get methods (accessor)
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }

  // set method
  public void setPassword(String newPassword){
    password = newPassword;
  }

  // toString
  public String toString(){
    return accountID + "\t" + balance;
  }

  // mutator methods
  public boolean deposit(double money){
    if (money < 0.0) {
      return false;
    } else {
      balance += money;
      return true;
    }
  }

  public boolean withdraw(double money){
    if (balance < money) {
      return false;
    } else {
      balance -= money;
      return true;
    }
  }

  private boolean authenticate(String password){
    return this.password.equals(password);
  }


  /**Transfer money from this BankAccount to the other only when the password matches, and the withdrawal succeeds.

 *@param other which BankAccount to GIVE the money to

 *@param amount how much money to transfer, negative amounts will make this operation fail.

 *@param password to be checked against the source account, incorrect password will make this operation fail.

 *@return true if successful, false otherwise.

 */

 public boolean transferTo(BankAccount other, double amount, String password){
   if (!this.authenticate(password) || amount < 0 || amount > balance) {
     return false;
   }
   balance -= amount;
   other.balance += amount;
   return true;
 }
}
