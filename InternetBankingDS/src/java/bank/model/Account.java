/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.model;

import java.util.Date;

/**
 *
 * @author Duc Canh HNA
 */
public class Account {

    private String ac_no;
    private String cust_id;
    private String password;
    private double balance;
    private Date open_date;
    private int level;
    
    public Account(){
        
    }

    public Account(String ac_no, String cust_id, String password, double balance, Date open_date, int level) {
        this.ac_no = ac_no;
        this.cust_id = cust_id;
        this.password = password;
        this.balance = balance;
        this.open_date = open_date;
        this.level = level;
    }
    
    public String getAc_no() {
        return ac_no;
    }

    public void setAc_no(String ac_no) {
        this.ac_no = ac_no;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getOpen_date() {
        return open_date;
    }

    public void setOpen_date(Date open_date) {
        this.open_date = open_date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }    
}
