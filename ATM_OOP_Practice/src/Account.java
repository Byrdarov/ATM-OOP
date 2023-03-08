import java.beans.Customizer;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double SavingBalance=0;

    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }
    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return SavingBalance;
    }

    public double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }

public double calcSavingWithdraw(double amount){
        SavingBalance=(SavingBalance-amount);
        return SavingBalance;
}
public double calcCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;

    }

    public double calcSavingDeposit(double amount){
        SavingBalance=(SavingBalance+amount);
        return SavingBalance;

    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to  withdraw from checking account:");
        double amount=input.nextDouble();

        if((checkingBalance-amount>=0)){
            System.out.println("New checking account balance: "+moneyFormat.format(calcCheckingWithdraw(amount)));
        }
        else{
            System.out.println("Balance cannot be negative"+"\n");
        }


        }

    public void getSavingWithdrawInput(){
        System.out.println("Checking Account Balance: "+ moneyFormat.format(SavingBalance));
        System.out.println("Amount you want to  withdraw from saving account:");
        double amount=input.nextDouble();

        if((SavingBalance-amount>=0)){
            System.out.println("New saving account balance: "+moneyFormat.format(calcSavingWithdraw(amount)));
        }
        else{
            System.out.println("Balance cannot be negative"+"\n");
        }


    }


    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to  deposit to checking account:");
        double amount=input.nextDouble();

        if((checkingBalance+amount>=0)){
            calcCheckingDeposit(amount);
        }
        else{
            System.out.println("Balance cannot be negative"+"\n");
        }


    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: "+ moneyFormat.format(SavingBalance));
        System.out.println("Amount you want to deposit to saving account:");
        double amount=input.nextDouble();

        if((SavingBalance+amount>=0)){
            calcSavingDeposit(amount);
        }
        else{
            System.out.println("Balance cannot be negative"+"\n");
        }


    }



}
