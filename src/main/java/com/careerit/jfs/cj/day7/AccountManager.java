package com.careerit.jfs.cj.day7;

public class AccountManager {

    public static void main(String[] args) {
        //creating and initializing the object
        //the variable "account1" stores the reference to the memory location in the heap that stores the object info
        //the variable itself is stored in the stack
        Account account1 = new Account(1000, "Rushi", 8000);
        account1.showDetails();
        Account account2 = new Account(1001, "Rohit", 500000);
        account2.deposit(5000);
        account2.showDetails();

    }


}
