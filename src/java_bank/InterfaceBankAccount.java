/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_bank;

/**
 *
 * @author Devi - BOE
 */
public interface InterfaceBankAccount {

    public final String BANK= "JavaBank";
    public void deposit(int amt);
    public void withdraw(int amt);
    public int getBalance();
    public String getBankName();
    }
    

