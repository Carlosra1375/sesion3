/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;

/**
 *
 * @author carlo
 */
public class Account {
    Double balance;

    public Account(Double balance){
        this.balance = balance;
    }
    
    public boolean withdraw(Double money){
        if((balance-money) >= -500){
            balance -= money;
            return true;
        }else{
            //throw new Exception("Insuficient funds in Account (balance "+balance+") for "+money+" withdraw");
            System.out.println("Insuficient funds in Account (balance "+balance+") for "+money+" withdraw");
            return false;
        }
    }
    
    public double deposit(Double money){
        balance += money;
        return balance;
    }
}
