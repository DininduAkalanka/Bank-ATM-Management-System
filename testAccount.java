import java.util.Scanner;
public class TestAccount {
        public static void main(String args[]){
            Scanner input  = new Scanner(System.in);

        System.out.println("=========================================================");
        System.out.println("       WELCOME TO THE BANK ACCOUNT ATM SYSTEM     ");
        System.out.println("=========================================================");
        System.out.println();

        System.out.print("Enter your 4-digit ATM PIN: ");
        int pin = input.nextInt();
        input.nextLine();
        final int validPin = 1234;
        if (pin != validPin) {
            System.out.println("Invalid PIN. Access Denied.");
            return;
        }

        
        System.out.println("Authentication Successful!");
        System.out.println();

            SavingAccount savingAccount = new SavingAccount("ABC123456", "Dinindu Akalanka",5000,0.04);
            CurrentAccount currentAccount = new CurrentAccount("CU456987","John Peter",10000,1000);
          

            boolean exit = false;
            while (!exit) {
                System.out.println("\n*******************************************************");
                System.out.println("                   ATM MAIN MENU                       ");
                System.out.println("*******************************************************");
                System.out.println("1. Select Account Type");
                System.out.println("2. Exit");
                System.out.print("Choose an option: ");
                int mainChoice = input.nextInt();
                input.nextLine(); 
    
                switch (mainChoice) {
                    case 1:
                        boolean accountExit = false;
                        while (!accountExit) {
                            System.out.println("\nSelect Account Type:");
                            System.out.println("1. Saving Account");
                            System.out.println("2. Current Account");
                            System.out.println("3. Exit to Main Menu");
                            System.out.print("Choose an option: ");
                            int accountType = input.nextInt();
                            input.nextLine(); 
    
                            if (accountType == 1) {
                                boolean savingExit = false;
                                while (!savingExit) {
                                    System.out.println("\n*******************************************************");
                                    System.out.println("               SAVING ACCOUNT MENU                     ");
                                    System.out.println("*******************************************************");
                                    System.out.println("1. Deposit");
                                    System.out.println("2. Withdraw");
                                    System.out.println("3. Show Account Details");
                                    System.out.println("4. Exit to Main Menu");
                                    System.out.print("Choose an option: ");
                                    int savingChoice = input.nextInt();
    
                                    switch (savingChoice) {
                                        case 1:
                                            System.out.print("Enter deposit amount for Saving Account: ");
                                            double savingDeposit = input.nextDouble();
                                            System.out.println();
                                            savingAccount.deposit(savingDeposit);
                                            break;
                                        case 2:
                                            System.out.print("Enter withdrawal amount for Saving Account: ");
                                            double savingWithdraw = input.nextDouble();
                                            System.out.println();
                                            savingAccount.withdraw(savingWithdraw);
                                            System.out.println();
                                            break;
                                        case 3:
                                        System.out.println("\n************** ACCOUNT DETAILS **************");
                                            System.out.println(savingAccount);
                                            break;
                                        case 4:
                                            savingExit = true;
                                            break;
                                        default:
                                            System.out.println("Invalid option.");
                                    }
    
                                    if (!savingExit) {
                                        System.out.print("Do you want another transaction in Saving Account? (yes/no): ");
                                        String continueChoice = input.next();
                                        savingExit = continueChoice.equalsIgnoreCase("no");
                                    }
                                }
                            } else if (accountType == 2) {
                                boolean currentExit = false;
                                while (!currentExit) {
                                    System.out.println("\n*******************************************************");
                                    System.out.println("               CURRENT ACCOUNT MENU                    ");
                                    System.out.println("*******************************************************");
                                    System.out.println("1. Deposit");
                                    System.out.println("2. Withdraw");
                                    System.out.println("3. Show Account Details");
                                    System.out.println("4. Exit to Account Type Menu");
                                    System.out.print("Choose an option: ");
                                    int currentChoice = input.nextInt();
    
                                    switch (currentChoice) {
                                        case 1:
                                            System.out.print("Enter deposit amount for Current Account: ");
                                            double currentDeposit = input.nextDouble();
                                            System.out.println();
                                            currentAccount.deposit(currentDeposit);
                                            System.out.println();
                                            break;
                                        case 2:
                                            System.out.print("Enter withdrawal amount for Current Account: ");
                                            double currentWithdraw = input.nextDouble();
                                            System.out.println();
                                            currentAccount.withdraw(currentWithdraw);
                                            System.out.println();
                                            break;
                                        case 3:
                                        System.out.println("\n************** ACCOUNT DETAILS **************");
                                            System.out.println(currentAccount);
                                            break;
                                        case 4:
                                            currentExit = true;
                                            break;
                                        default:
                                            System.out.println("Invalid option.");
                                    }
    
                                    if (!currentExit) {
                                        System.out.print("Do you want another transaction in Current Account? (yes/no): ");
                                        String continueChoice = input.next();
                                        currentExit = continueChoice.equalsIgnoreCase("no");
                                    }
                                }
                            } else if (accountType == 3) {
                                accountExit = true;
                            } else {
                                System.out.println("--------Invalid account type.---------");
                            }
                        }
                        break;
                    case 2:
                        exit = true;
                        System.out.println("\n=========================================================");
                        System.out.println("      THANK YOU FOR USING THE ATM. HAVE A GREAT DAY!     ");
                        System.out.println("=========================================================");
                        break;
                    default:
                        System.out.println("---------Invalid option. Please try again.---------");
                }
            }
    
            input.close();
         }
} 
