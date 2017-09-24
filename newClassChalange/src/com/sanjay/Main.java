package com.sanjay;

import com.VipCustomer;

public class Main {

    public static void main(String[] args) {
	    BankAccount checking = new BankAccount();
	    checking.setAccountNumber("987654321012");
	    checking.setCostumerName("Sanjay");
	    checking.seteMail("kaflesanjay@hotmail.com");
	    checking.setPhoneNo("3039684039");
        //BankAccount saving = new BankAccount();
        checking.setBalance(00);
        checking.depositFund (100);
        checking.withdrawFund(1000);

        checking.depositFund (1200);
        checking.withdrawFund(1000);

        //System.out.println("balance is " + checking.getBalance());
        //System.out.println("balance is " + checking.getBalance());
        VipCustomer sanjay = new VipCustomer("abc",1000.00, "something@nothing.com");
        System.out.println(sanjay.getEmail());
        System.out.println(sanjay.getName());

        VipCustomer aa3 = new VipCustomer();
        System.out.println(aa3.getEmail());
        System.out.println(aa3.getName());

        VipCustomer newCustomer = new VipCustomer("xyz" , 555.39);
        System.out.println(newCustomer.getEmail());
        System.out.println(newCustomer.getName());

    }
}
