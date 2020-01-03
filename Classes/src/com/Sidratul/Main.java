package com.Sidratul;

public class Main {

    public static  void main(String[] args) {
	   /* Car porsche = new Car();
	    porsche.setModel("Bmw");
        System.out.println("Model is " + porsche.getModel());*/
	   BankAccount sid = new BankAccount(9887, 200, "Sidratul", "smun@mk.com", "0186789565");
	   sid.depositeFund(50);
        sid.withdrawFund(100);

        sid.depositeFund(51);
        sid.withdrawFund(100);
    }
}
