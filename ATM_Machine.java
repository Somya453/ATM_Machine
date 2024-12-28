

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN=4567;


    public void checkPin(){
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enteredPin=sc.nextInt();
        if(enteredPin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");



        Scanner sc= new Scanner(System.in);
        int opt=sc.nextInt();


        if(opt==1){
            checkBalance();
        }

        else if (opt==2) {
            WithdrawMoney();

        }

        else if (opt==3) {
            DepositMoney();
            
        }

        else if (opt==4) {
            return;
            
        }

        else{
            System.out.println("Enter a valid choice");
        }
    }


        public void checkBalance(){
            System.out.println("Balance: " + Balance);
            menu();
        }

        public void WithdrawMoney(){
            System.out.println("Enter Amount to Withdraw: ");

            Scanner sc=new Scanner(System.in);
            float Amount=sc.nextFloat();
            if (Amount>Balance) {
                System.out.println("Insufficient Balance");
                
            }
            else{
                Balance=Balance-Amount;
                System.out.println("Money Withdrawl Success");
            }
            menu();
        }   
        public void DepositMoney(){
            System.out.println("Enter the Amount:");
            Scanner sc=new Scanner(System.in);
            float Amount=sc.nextFloat();
        }
    }   





public class ATM_Machine{
    public static void main(String[] args) {

        ATM obj=new ATM();
        obj.checkPin();
        
    }
}