public class CurrentAccount extends BankAccount {

    private double balance;
    private double overDraftLimit;

    public CurrentAccount(String accountNumber,String accountholderName,double balance,double overDraftLimit){
        super(accountNumber,accountholderName);
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;

    }
    public double getBalance(){
        return balance;
    }
    public double getOverDraftLimt(){
        return overDraftLimit;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setOverDraftLimit(double overDraftLimit){
        this.overDraftLimit = overDraftLimit;
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

    

    public String toString(){
        return super.toString()+ "\nBalance : "+getBalance();
    }


    
}
