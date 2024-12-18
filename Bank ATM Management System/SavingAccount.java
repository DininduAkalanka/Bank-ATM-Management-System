public class SavingAccount extends BankAccount {

    private double balance;
    private double interestRate;
    

    public SavingAccount(String accountNumber,String accountholderName,double balance,double interestRate){
        super(accountNumber,accountholderName);
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){

        this.interestRate=interestRate;
    }
    public void deposit(double amount){
        if(amount>0){

         balance+= amount;
        System.out.println("You Deposit $"+amount+" is Successful.");
        System.out.println("Current Balance : $"+getBalance());

        }
        else{
            System.out.println("Invalid amount.");
        }
        

    }

    public void withdraw(double amount){

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You Withdraw $"+amount+" is Successful.");
            System.out.println("Current Balance : $"+getBalance());
        } 
        else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public double afterBalanceWithInterestRate(){
        return (getBalance()*getInterestRate())+getBalance();
    }

    public String toString(){
        return super.toString() + "\nAccount Balance : $"+getBalance() + "\nInterest Rate: "+getInterestRate()+"\nBalance With Interest: "+afterBalanceWithInterestRate();
    }
   
    
}
