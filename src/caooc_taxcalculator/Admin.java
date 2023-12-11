/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caooc_taxcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Admin extends Users {

    public Admin(int ID, String firstName, String lastName, String email, String PPSN, double grossIncome, double taxCredit, double taxOwed, String username, String password) {
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
    

    
    public List<Users> getAllUsers(List<Users> allUsers) {
        List<Users> otherUsers = new ArrayList<>(allUsers);
        otherUsers.remove(this); // Remove the manager from the list
        return otherUsers;
    }

   
    public void removeUser(List<Users> allStaff, Users userToRemove) {
        if (allStaff.contains(userToRemove)) {
            allStaff.remove(userToRemove);
            System.out.println(userToRemove.getFirstName() + " " + userToRemove.getLastName() + " removed from the system.");
        } else {
            System.out.println("User not found in the system.");
        }
    }

    
    public void reviewUserOperations(Users user) {
        
        System.out.println("Reviewing operations performed by " + user.getFirstName() + " " + user.getLastName());
    }
        
    
}
