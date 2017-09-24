package com.sanjay;

/**
 * Created by kafle on 6/3/2017.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String costumerName;
    private String eMail;
    private String phoneNo;

    public BankAccount(){
        System.out.println("my head is pain");
    }
    //double withdraw = 1000;
    //double deposit = 100;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
        //return balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setCostumerName(String costumerName){
        this.costumerName = costumerName;
    }
    public String getCostumerName(){
        return this.costumerName;
    }
    public void seteMail(String eMail){
        this.eMail = eMail;
    }
    public String geteMail(){
        return  this.eMail;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
    public void depositFund(double deposit) {
        this.balance = balance;
        System.out.println("the balance was: " + balance);
        System.out.println("deposit = " + deposit);
        double newBalance = balance + deposit;
        System.out.println("balance after deposit : " + newBalance);
        balance = newBalance;
    }

    public void withdrawFund(double withdraw) {
        this.balance = balance;
        if(balance > withdraw) {
            System.out.println("the withdraw was: " + withdraw);
            double remainBalance = balance - withdraw;
            System.out.println("balance after withdraw = " + remainBalance);
            balance = remainBalance;
        }
        else{
            System.out.println("insufficient fund");
        }
    }

}
