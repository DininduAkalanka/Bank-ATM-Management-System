public class BankAccount{
    private String accountNumber;
    private String accountholderName;

    public BankAccount(String accountNumber,String accountholderName){

        this.accountNumber = accountNumber;
        this.accountholderName = accountholderName;
        

    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String  getAccountHolderName(){
        return accountholderName;
    }


    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountHolderName(String accountholderName){
        this.accountholderName = accountholderName;
    }
  

    public String toString(){
        return "Account Number : "+getAccountNumber()+"\nAccount Holder Name: "+getAccountHolderName();
    }

        
}