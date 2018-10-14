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
    return this.password.equals();
  }
}
