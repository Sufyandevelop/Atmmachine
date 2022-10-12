//import required classes and packages
import java.util.Scanner;

//create ATMExample class to implement the ATM functionality
 class ATMproject
{
    //main method starts
    public static void main(String [] args )
    {
        //declare and initialize balance, withdraw, and deposit
        int balance = 100000, withdraw, deposit;

        //create scanner class object to get choice of
        Scanner sc = new Scanner(System.in);

        while(true)//used for true statement
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            //get choice from user
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    //get the withdrawl money from user
                    withdraw = sc.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if(balance >= withdraw)
                    {
                        //remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println(" ");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    //get deposite amount free vila
                    deposit = sc.nextInt();

                    //add the deposit amount to the total balanace
                    // add the to deposit number nan
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println(" grate opportunites");
                    break;

                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    //exit from the menu
                    System.exit(0);
            }
        }
    }
}
// this keyword is the reference variable that refers to the  current object.
// super keyword is the  that refersreference variable the super class .
