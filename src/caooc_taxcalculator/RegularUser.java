/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caooc_taxcalculator;

/**
 *
 * @author danie
 */
public class RegularUser extends Users{
    
    public RegularUser(int ID, String firstName, String lastName, String email, String PPSN, double grossIncome, double taxCredit, double taxOwed, String username, String password) {
        super(ID, firstName, lastName, email, PPSN, grossIncome, taxCredit, taxOwed, username, password);
    }
    public void modifyOwnProfile(String newFirstName, String newLastName, String newemail, String newPPSN, double newgrossIncome, double newtaxCredit, double newtaxOwed, String newusername, String newpassword) {
        setFirstName(newFirstName);
        setLastName(newLastName);
        setEmail(newemail);
        setPPSN(newPPSN);
        setGrossIncome(newgrossIncome);
        setTaxCredit(newtaxCredit);
        setTaxOwed(newtaxOwed);
        setUsername(newusername);
        setPassword(newpassword);
}
}